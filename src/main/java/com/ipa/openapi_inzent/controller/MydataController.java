package com.ipa.openapi_inzent.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ipa.openapi_inzent.model.*;
import com.ipa.openapi_inzent.service.MydataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.spring.web.json.Json;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/mydata")
public class MydataController {

    private MydataService mydataService;

    @Autowired
    public MydataController(MydataService mydataService) {
        this.mydataService = mydataService;
    }



    @GetMapping("/mydataSendReq/pagination")
    @ResponseBody
    public JsonArray mydataSendReq(Model model, @RequestParam("pageNo") int pageNo) throws JsonProcessingException {
        JsonObject jsonObject = null;
        JsonArray jsonArray = null;
        System.out.println("pageNo = " + pageNo);
        List<MdReqInfoDTO> list = mydataService.selectMdReqAllasPagination(pageNo);
        int count = mydataService.countAll();
        int size = 1;
        int pageCount = count / size;
        System.out.println("count = " + count);
        System.out.println("list = " + list);
        for (MdReqInfoDTO mdReqInfoDTO : list) {
            jsonArray = new JsonArray();
            jsonObject = new JsonObject();
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(mdReqInfoDTO);
            jsonObject.addProperty("list", jsonString);
            jsonObject.addProperty("pageCount", count);

            jsonArray.add(jsonObject);
            System.out.println("jsonObject = " + jsonObject);
        }

        return jsonArray;
    }


}
