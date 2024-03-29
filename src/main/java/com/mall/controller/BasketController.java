package com.mall.controller;

import com.mall.model.BasketDTO;
import com.mall.model.ProductDTO;
import com.mall.model.UserDTO;
import com.mall.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/basket/", method = RequestMethod.GET)
public class BasketController {
    BasketService basketService;
    UserService userService;
    ProductService productService;
    TransactionService transactionService;

    @Autowired
    public BasketController(BasketService basketService, ProductService productService, UserService userService, TransactionService transactionService) {
        this.basketService = basketService;
        this.productService = productService;
        this.userService = userService;
        this.transactionService = transactionService;
    }

    @PostMapping(value = "addBasket")
    public String addBasket(@ModelAttribute("count") String count, HttpSession session, BasketDTO basketDTO, HttpServletRequest request) {
        int productId = (int) session.getAttribute("productId");
        UserDTO user = (UserDTO) session.getAttribute("user");
        System.out.println("count = " + count);
        System.out.println("productId = " + productId);
        System.out.println("user = " + user);
        if (count != null && productId != 0 && user != null) {
            Timestamp time = new Timestamp(System.currentTimeMillis());
            String trimCount = count.trim();

            int countIntParsing = Integer.parseInt(trimCount);
            ProductDTO product = productService.selectOne(productId);
            UserDTO userDTO = userService.selectOne(user);

            int totalCount = product.getPrice() * countIntParsing;
            System.out.println(totalCount);

            basketDTO.setProductId(product.getProductId());
            basketDTO.setCount(countIntParsing);
            basketDTO.setBasketAddDate(time);
            basketDTO.setUserId(userDTO.getUserId());
            basketDTO.setTotalPrice(totalCount);

            System.out.println("basketDTO = " + basketDTO);
            if (basketService.insertBasket(basketDTO)) {
                System.out.println("등록완료!!");
            } else {
                System.out.println("등록실패ㅠㅠ");
            }
        }
        return "redirect:/product/item/" + productId;
    }

    @GetMapping(value = "showBasket/{id}")
    public String showBasket(@PathVariable int id, Model model, HttpSession session, RedirectAttributes redirectAttributes) {
        List<BasketDTO> basketList = basketService.showAllBasket(id);
        System.out.println("basketList = " + basketList);
        List<ProductDTO> productNameList = productService.selectProductName(id);
        System.out.println("productNameList = " + productNameList);

        int userId = (int) session.getAttribute("userId");
        int user = userService.findUserId(userId);

        System.out.println("user = " + user);

        model.addAttribute("userId", user);

        if(session.getAttribute("product") != null) {
            int productId = (int) session.getAttribute("product");
            System.out.println("productId = " + productId);
        }
        model.addAttribute("productName", productNameList);
        model.addAttribute("basket", basketList);

        return "basket/BasketShow";
    }

    @PostMapping("delete/{id}")
    public String deleteBasket(@PathVariable int id){
        basketService.deleteOneBasket(id);
        return "redirect:/basket/BasketShow/";
    }

    @PostMapping("deleteAll/{id}")
    public String deleteAllBasket(@PathVariable int id){
        basketService.deleteAllBasket(id);
        return "redirect:/";
    }

    @GetMapping("selectOne/{id}")
    public String selectOneBasket(@PathVariable int id){
        basketService.selectOneBasket(id);
        return "redirect:/transaction/showAllTransaction";
    }
}
