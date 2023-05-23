package com.mall.controller;

import com.mall.model.UserDTO;
import com.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.*;

@Controller
@RequestMapping(value = "/user/", method = RequestMethod.POST)
public class UserController {
    UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("register")
    public String userRegister(UserDTO user) {
        System.out.println("userDTO = " + user);
        if(userService.insert(user)){
            return "redirect:/";
        }else{
            return "user/register";
        }
    }

   @GetMapping("login")
    public String login(UserDTO user, RedirectAttributes redirectAttributes) {
       System.out.println("userDTO = " + user);
       UserDTO result = userService.selectOne(user);
       System.out.println("result = " + result);
       if (result != null){
           redirectAttributes.addAttribute("userRole", result.getUserRole());
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
