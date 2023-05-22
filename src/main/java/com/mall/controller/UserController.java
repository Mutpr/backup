package com.mall.controller;

import com.mall.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user/")
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
    public String login() {
        return "user/login";
    }

    @GetMapping("update")
    public String update() {
        return "user/update";
    }
}
