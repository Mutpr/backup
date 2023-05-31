package com.mall.controller;

import com.mall.service.ProductService;

import javax.servlet.http.HttpSession;

public class ControllerImpl {
    ProductService productService;

    public int sessionToInt(HttpSession session, String sessionName){
        String sessionResultInt = (String)session.getAttribute(sessionName);
        if(sessionResultInt != null){
            String resultTrim = sessionResultInt.trim();
            return Integer.parseInt(resultTrim);
        }else{
            return 0;
        }
    }

    public int countPage(int countList){
        countList = productService.countAll();
        System.out.println("countList = " + countList);
        return countList;
    }

    public int StringToInt(String params){
        if(params != null){
            String paramsTrim = params.trim();
            int param = Integer.parseInt(paramsTrim);
            return param;
        }else {
            return 0;
        }
    }
}
