package com.mall.controller;


import com.mall.model.ProductDTO;
import com.mall.model.UserDTO;
import com.mall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller

public class HomeController {
    ProductService productService;
    @Autowired
    public HomeController(ProductService productService) {
        this.productService = productService;
    }
    @RequestMapping("/")
    public String showIndex(Model model, @ModelAttribute("userRole") String role) {
        List<ProductDTO> list = productService.selectAll();
        model.addAttribute("product", list);
        return "index";
    }

}
