package com.mall.controller;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.mall.service.BasketService;
import com.mall.service.CategoryService;
import com.mall.service.ProductService;
import com.mall.service.UserService;
import com.mysql.cj.xdevapi.JsonNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.CharArrayReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/chart/")
public class ChartController {
    ProductService productService;
    BasketService basketService;
    CategoryService categoryService;
    UserService userService;
    @Autowired
    public ChartController(ProductService productService, BasketService basketService, CategoryService categoryService, UserService userService){
        this.basketService = basketService;
        this.productService = productService;
        this.categoryService = categoryService;
        this.userService = userService;
    }

    @GetMapping("showChart")
    public String showChart(){

        return "chart/ShowChart";
    }

    @ResponseBody
    @GetMapping("categoryCountDoughnut")
    public JsonArray jsonObject(){
        int id = categoryService.countCategory();
        JsonArray jsonArray = new JsonArray();
        JsonObject jsonObject = null;
        for(int i =1; i<=id; i++) {
            jsonObject = new JsonObject();
            int countProduct = categoryService.countCategoryProduct(i);
            String category = categoryService.getName(i);

            JsonReader jsonCountReader = new JsonReader(new StringReader(String.valueOf(countProduct)));
            JsonReader jsonNameReader = new JsonReader(new StringReader(category));

            jsonCountReader.setLenient(true);
            jsonNameReader.setLenient(true);

            JsonElement jsonCount = JsonParser.parseReader(jsonCountReader);
            JsonElement jsonName = JsonParser.parseReader(jsonNameReader);

            jsonObject.add("count", jsonCount);
            jsonObject.add("name", jsonName);

            jsonArray.add(jsonObject);
            System.out.println("countProduct = " + countProduct);
        }return jsonArray;
    }
}
