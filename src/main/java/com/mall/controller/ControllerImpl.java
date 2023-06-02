package com.mall.controller;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import com.mall.service.ProductService;

import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.StringReader;

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

//    public JsonObject parseJson(String path){
//        try{
//            JsonReader jsonReader = new JsonReader(new StringReader(path));
//            JsonObject jsonobj = new JsonObject(jsonReader, jsoobj.class);
//
//        }catch(MalformedJsonException e){
//            e.printStackTrace();
//        }
//
//    }

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
