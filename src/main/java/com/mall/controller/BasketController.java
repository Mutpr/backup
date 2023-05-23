package com.mall.controller;

import com.mall.model.BasketDTO;
import com.mall.model.ProductDTO;
import com.mall.model.TransactionDTO;
import com.mall.model.UserDTO;
import com.mall.service.BasketService;
import com.mall.service.ProductService;
import com.mall.service.TransactionService;
import com.mall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/basket/")
public class BasketController {
    TransactionService transactionService;
    BasketService basketService;
    UserService userService;
    ProductService productService;

    public BasketController(TransactionService transactionService, BasketService basketService, UserService userService, ProductService productService) {
        this.transactionService = transactionService;
        this.basketService = basketService;
        this.productService = productService;
        this.userService = userService;
    }

    @GetMapping(value = "showBasket")
    public String showBasket(HttpSession session, Model model, TransactionDTO transactionDTO, HttpServletRequest request) {
        System.out.println("session.getAttribute(productId) = " + session.getAttribute("productId"));
        System.out.println("session.getAttribute(\"\") = " + session.getAttribute("countOption"));
        String value = request.getParameter("countOption");
        System.out.println("value = " + value);
        List<TransactionDTO> list = transactionService.showAllTransaction();
        System.out.println("list = " + list);
        model.addAttribute("transactions", list);
        return "basket/show";
    }

    @PostMapping(value = "insert/{id}")
    public String insertBasket(HttpSession session, @PathVariable int id) {
        return "redirect:/product/items/{id}";
    }
}
