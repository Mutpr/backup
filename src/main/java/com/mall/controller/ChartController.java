package com.mall.controller;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.mall.model.ProductDTO;
import com.mall.service.BasketService;
import com.mall.service.ChartService;
import com.mall.service.ProductService;
import com.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.StringReader;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/chart/")
public class ChartController {
    ProductService productService;
    BasketService basketService;
    ChartService chartService;
    UserService userService;

    @Autowired
    public ChartController(ProductService productService, BasketService basketService, ChartService chartService, UserService userService) {
        this.basketService = basketService;
        this.productService = productService;
        this.chartService = chartService;
        this.userService = userService;
    }

    @GetMapping("showChart")
    public String showChart() {

        return "chart/ShowChart";
    }

    @ResponseBody
    @GetMapping("categoryCountDoughnut")
    public JsonArray jsonObject() {
        int id = chartService.countCategory();
        JsonArray jsonArray = new JsonArray();
        JsonObject jsonObject = null;
        for (int i = 1; i <= id; i++) {
            jsonObject = new JsonObject();
            int countProduct = chartService.countCategoryProduct(i);
            String category = chartService.getName(i);

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
        }
        return jsonArray;
    }

    @ResponseBody
    @GetMapping("/countByPrice")
    public JsonArray countByPrice(@RequestParam("start[]") List<Integer> start, @RequestParam("limit[]") List<Integer> limit, @RequestParam("category[]") List<Integer> category) {
        HashMap<String, Integer> map = new HashMap<>();
        JsonArray jsonArray = new JsonArray();
        JsonObject jsonObject = null;
        int result = 0;
        try {
            for (int j = 0; j < category.size(); j++) {
                for (int i = 0; i < start.size()-1; i++) {
                    jsonObject = new JsonObject();
                    map.put("category", category.get(j));
                    map.put("start", start.get(i));
                    map.put("limit", limit.get(i));
                    if (i >= start.size()) {
                        j++;
                        i = 0;
                    } else {
                        result = productService.countByPrice(map);
                        System.out.println("result = " + result);

                        JsonReader jsonReader = new JsonReader(new StringReader(String.valueOf(result)));
                        jsonReader.setLenient(true);
                        JsonElement json = JsonParser.parseReader(jsonReader);
                        jsonObject.add("result", json);
                        JsonParser jsonParser = new JsonParser();

                        jsonReader = new JsonReader(new StringReader(String.valueOf(category.get(j))));
                        JsonElement categoryJson = JsonParser.parseReader(jsonReader);
                        jsonObject.add("category", categoryJson);

                        jsonReader = new JsonReader(new StringReader(String.valueOf(start.get(j))));
                        JsonElement startJson = JsonParser.parseReader(jsonReader);
                        jsonObject.add("start", startJson);
                        jsonArray.add(jsonObject);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("jsonArray = " + jsonArray);
        return jsonArray;
    }
}
