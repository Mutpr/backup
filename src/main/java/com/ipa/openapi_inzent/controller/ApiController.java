package com.ipa.openapi_inzent.controller;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ipa.openapi_inzent.model.*;
import com.ipa.openapi_inzent.service.ApiDetailsService;
import com.ipa.openapi_inzent.service.ApiService;
import com.ipa.openapi_inzent.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import springfox.documentation.spring.web.json.Json;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

@RequestMapping("api")
@Controller
public class ApiController {

    ApiService apiService;
    RoleService roleService;
    ApiDetailsService apiDetailsService;

    String[] array = {"get", "post", "put", "delete"};

    @Autowired
    public ApiController(ApiService apiService, ApiDetailsService apiDetailsService, RoleService roleService) {
        this.apiService = apiService;
        this.apiDetailsService = apiDetailsService;
        this.roleService = roleService;
    }


    //pagination
    @ResponseBody
    @GetMapping(value = "/pagination")
    public JsonArray selectAsPagination(@RequestParam("apisId") int apisId ,@RequestParam("pageNo") int pageNo) {
        System.out.println("apisId = " + apisId);
        System.out.println("pageNo = " + pageNo);
        JsonObject jsonObject = null;
        JsonArray array = null;
        int resourceCount = apiDetailsService.countAll(apisId);
        int size = 1;
        int pageCount = resourceCount/size;
        List<ApiDetailsDTO> resourcelist = apiDetailsService.apiDetailsDTOListPaging(pageNo, apisId);
        System.out.println("list = " + resourcelist);
        if (pageNo != 0 && apisId != 0 && resourcelist != null) {
            for (ApiDetailsDTO apiDetailsDTO: resourcelist) {
                array = new JsonArray();
                jsonObject = new JsonObject();

                String uri = apiDetailsDTO.getUri();
                String method = apiDetailsDTO.getMethod();
                String summary = apiDetailsDTO.getSummary();
                String version = apiDetailsDTO.getVersion();
                String security = apiDetailsDTO.getSecurity();
                String operationId = apiDetailsDTO.getOperationId();

                jsonObject.addProperty("method", method);
                jsonObject.addProperty("uri", uri);
                jsonObject.addProperty("summary", summary);
                jsonObject.addProperty("operationId", operationId);
                jsonObject.addProperty("security", security);
                jsonObject.addProperty("version", version);

                jsonObject.addProperty("apis", apisId);
                jsonObject.addProperty("pageNo", pageNo);
                jsonObject.addProperty("pageCount", pageCount);
                System.out.println("jsonObject = " + jsonObject);
                array.add(jsonObject);
            }
        }
       return array;
    }

}

