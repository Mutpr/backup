package com.mall.controller;


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
import java.util.UUID;

@Controller
@RequestMapping("/product/")
public class ProductController {

    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "item/{id}")
    public String showProductList(Model model, @PathVariable int id) {
        System.out.printf("dto:" + productService.selectOne(id));
        ProductDTO productDTO = productService.selectOne(id);
        model.addAttribute("productDetail", productDTO);
        return "product/list";
    }

    @GetMapping("create")
    public String productRegister(ProductDTO product) {
        System.out.println(product);
        if (productService.insert(product)) {
            return "redirect:product/create";
        } else {
            return "product/create";
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

        File saveFile = new File(httpServletRequest.getServletContext().getRealPath(folderPath) + filename);
        System.out.println("saveFile = " + saveFile);
        /* 실제 폴더에 파일 업로드 */
        try {
            file.transferTo(saveFile);
        } catch (Exception ex) {
            System.out.println("file upload fail in method fileUpload");
        }

        productDTO.setFiledata(String.valueOf(saveFile));
        productService.insert(productDTO);
        return "redirect:/product/create";
    }

    @RequestMapping("delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.delete(id);
        return "redirect:/";
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
        System.out.println("update= "+productDTO);
        return "product/update";
    }
}