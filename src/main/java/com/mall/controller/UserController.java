package com.mall.controller;

import com.mall.model.ProductDTO;
import com.mall.model.UserDTO;
import com.mall.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/user/", method = RequestMethod.POST)
public class UserController {
    UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("register")
    public String userRegister() {
        return "user/register";
    }

   @GetMapping("login")
    public String login(UserDTO user, RedirectAttributes redirectAttrs) {
       System.out.println("userDTO = " + user;
       UserDTO result = userService.selectOne(user);
       System.out.println("result = " + result);
       if (result != null){
           redirectAttrs.addFlashAttribute("userDTO", result);
           return "redirect:/";
       }else{
           return "user/login";
       }
    }

    @GetMapping("update")
    public String update() {
        return "user/update";
    }
}
