package com.ipa.openapi_inzent.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.ipa.openapi_inzent.model.RequestDTO;
import com.ipa.openapi_inzent.model.UserDTO;
import com.ipa.openapi_inzent.service.RequestService;
import com.ipa.openapi_inzent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
public class RequestController {
    RequestService requestService;
    UserService userService;

    @Autowired
    public RequestController(RequestService requestService, UserService userService) {
        this.userService = userService;
        this.requestService = requestService;
    }


    @ResponseBody
    @GetMapping("pagination")
    public JsonArray requestPagination(@RequestParam("pageNo") int pageNo) throws JsonProcessingException {
        JsonObject jsonObject = null;
        JsonArray jsonArray = new JsonArray();
        List<RequestDTO> list  = requestService.selectAll(pageNo);
        int totalPage = requestService.countAll();
        int size = 2;
        int page = totalPage/size;
        if(totalPage % size !=0){
            page++;
        }
        System.out.println("size = " + size);
        System.out.println("list = " + list);
        for(RequestDTO requestDTO: list){
            jsonObject = new JsonObject();
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(requestDTO);
            jsonObject.addProperty("DTO",jsonString);
            jsonObject.addProperty("pageNo", pageNo);
            jsonObject.addProperty("totalPage", page);

            jsonArray.add(jsonObject);
            System.out.println("jsonArray = " + jsonArray);
        }
        return jsonArray;
    }


}
