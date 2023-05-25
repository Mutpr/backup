package com.mall.controller;

import com.mall.model.BasketDTO;
import com.mall.model.ProductDTO;
import com.mall.model.UserBasketDTO;
import com.mall.model.UserDTO;
import com.mall.service.BasketService;
import com.mall.service.ProductService;
import com.mall.service.UserBasketService;
import com.mall.service.UserService;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
@Controller
@RequestMapping("/basket/")
public class BasketController {
    BasketService basketService;
    UserBasketService userBasketService;
    UserService userService;
    ProductService productService;

    public BasketController(BasketService basketService, UserBasketService userBasketService, UserService userService, ProductService productService) {
        this.basketService = basketService;
        this.userBasketService = userBasketService;
        this.productService = productService;
        this.userService = userService;
    }

    @GetMapping(value = "addBasket")
    public String addBasket(@ModelAttribute("count") String count, HttpSession session, BasketService basketService, BasketDTO basketDTO, HttpServletRequest request) {
        int productId = (int) session.getAttribute("productId");
        UserDTO user = (UserDTO) session.getAttribute("userId");
        String countToString = (String) session.getAttribute("count");
        if(countToString != null && productId != 0 && userId != 0) {
            Timestamp time = new Timestamp(System.currentTimeMillis());
            String regIdString = countToString.trim();
            int countToInt = Integer.parseInt(regIdString);

            ProductDTO product = productService.selectOne(productId);
            UserDTO userDTO = userService.selectOne(user);
            basketDTO.setProductId(product.getProductId());
            basketDTO.setCount(countToInt);
            basketDTO.setBasketTime(time);
            basketDTO.setUserId(userDTO.getUserId());

        }
        //basketService.insertTransaction();
        return "redirect:/product/item/"+id;
    }

    @GetMapping(value = "showBasket")
    public String showBasket(){
        return "basket/show";
    }

    void getDuplicateByOneForSET(List<UserBasketDTO> userList){
        Set<Integer> duplicateSet = new HashSet<>();
        List<Integer> userIdList = new ArrayList<>();

        for(UserBasketDTO userBasket : userList){
            int userId = userBasket.getUserId();
            if(userIdList.contains(userId)){
               duplicateSet.add(userId);
            }else{
                userIdList.add(userId);
            }
            System.out.println("duplicateSet = " + duplicateSet);
        }
    }

}
