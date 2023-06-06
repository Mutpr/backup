package com.mall.controller;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.mall.model.ProductDTO;
import com.mall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "/product/")
public class ProductController {

    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "item/{id}")
    public String showOneProduct(HttpSession session, Model model, @PathVariable int id) {
        System.out.printf("dto:" + productService.selectOne(id));
        ProductDTO productDTO = productService.selectOne(id);
        String role = (String) session.getAttribute("userRole");
        if (session.getAttribute("userId") != null) {
            int userId = (Integer) session.getAttribute("userId");
            if (userId == 0) {
                String userIdToString = (String) session.getAttribute("userId");
                String userIdToStringTrim = userIdToString.trim();
                int userIdToInt = Integer.parseInt(userIdToStringTrim);
                model.addAttribute("userId", userIdToInt);
            }
        }
        model.addAttribute("userRole", role);
        model.addAttribute("productDetail", productDTO);

        session.setAttribute("productId", productDTO.getProductId());
        return "product/ProductItem";
    }

    @ResponseBody
    @RequestMapping(value = "pagination")
    public JsonArray showIndex(@RequestParam("pageNo") String pageNo) {
        JsonArray object = new JsonArray();
        JsonObject jsonObject = null;
        System.out.println("pageNo = " + pageNo);
        if (pageNo != null) {
            int page = Integer.parseInt(pageNo);
            System.out.println("pageNo = " + page);
            List<ProductDTO> list = productService.selectAsPagination(page);
                for (int i = 0; i < list.size(); i++) {
                    jsonObject = new JsonObject();
                    String name = list.get(i).getProductName();
                    JsonReader reader = new JsonReader(new StringReader(name));
                    reader.setLenient(true);
                    JsonElement json = JsonParser.parseReader(reader);
                    jsonObject.add("name", json);
                    object.add(jsonObject);
                    System.out.println("object = " + object);
                }
            }
            return object;
        }

    @GetMapping("create")
    public String productRegister(ProductDTO product) {
        System.out.println(product);
        if (productService.insert(product)) {
            return "redirect:product/create";
        } else {
            return "product/ProductCreate";
        }
    }

    @PostMapping(value = "fileUpload")
    public String FileUpload(ProductDTO productDTO, @RequestParam("file") MultipartFile file, HttpServletRequest httpServletRequest) {
        System.out.println("===================");
        System.out.println("productDTO = " + productDTO);
        String folderPath = "/upload/img/";
        /* 파일 이름 변경 */
        UUID uuid = UUID.randomUUID();
        String filename = uuid + "_" + file.getOriginalFilename();

        File saveFile = new File(httpServletRequest.getSession().getServletContext().getRealPath(folderPath) + filename);
        System.out.println("saveFile = " + saveFile);
        /* 실제 폴더에 파일 업로드 */
        try {
            file.transferTo(saveFile);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("file upload fail in method fileUpload");
        }

        productDTO.setFiledata(String.valueOf(saveFile));
        productService.insert(productDTO);
        return "redirect:/";
    }

    @RequestMapping("delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.delete(id);
        return "redirect:/";
    }


    @GetMapping("showAll")
    public String showIndex(Model model, HttpSession session) {
        String pageNo = (String) session.getAttribute("pageNo");
        ControllerImpl controller = new ControllerImpl();
        int page = controller.StringToInt(pageNo);

        return "product/showAll";
    }

    @GetMapping("update/{id}")
    public String updateProduct(@PathVariable int id, HttpServletRequest request, Model model, MultipartFile file) {
        model.addAttribute("productNumber", id);
        ProductDTO productDTO = productService.selectOne(id);

        System.out.println("before productDTO = " + productDTO);

        String name = request.getParameter("productName");
        String price = request.getParameter("price");
        String description = request.getParameter("description");
        String image = request.getParameter("file");

        System.out.println("name = " + name);
        System.out.println("price = " + price);
        System.out.println("description = " + description);
        System.out.println("image = " + image);

        if (productDTO != null && price != null) {
            int priceInt = Integer.parseInt(price);
            System.out.println("priceInt = " + priceInt);

            productDTO.setProductName(name);
            productDTO.setPrice(priceInt);
            productDTO.setDescription(description);
            productDTO.setImage(image);

            System.out.println("after productDTO= " + productDTO);
            productService.update(productDTO);

            return "redirect:/";
        }
        System.out.println("update= " + productDTO);
        return "product/ProductUpdate";
    }

    private HashMap<String, Integer> setPages(int pageNo, int totalPage) {
        HashMap<String, Integer> paging = new HashMap();
        int start = 0;
        int end = 0;

        if (totalPage < 5) {
            start = 1;
            end = totalPage;
        } else if (pageNo < 3) {
            start = 1;
            end = 5;
        } else if (pageNo > totalPage - 3) {
            start = totalPage - 4;
            end = totalPage;
        } else {
            start = pageNo - 2;
            end = pageNo + 2;
        }

        paging.put("start", start);
        paging.put("end", end);
        paging.put("totalPage", totalPage);
        paging.put("current", pageNo);

        return paging;
    }

    @ResponseBody
    @GetMapping(value = "countAll")
    public JsonObject countAll(){
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("count", productService.countAll());
        return jsonObject;
    }

}
