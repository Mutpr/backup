package com.ipa.openapi_inzent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chart/")
public class ChartController {
    @Autowired
    public ChartController(){
    }

    @GetMapping("showChart")
    public String ShowChart(){
        return "chart/showChart";
    }

}
