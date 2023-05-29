package com.mall.controller;

import com.mall.model.ProductDTO;
import com.mall.model.TransactionDTO;
import com.mall.service.BasketService;
import com.mall.service.ProductService;
import com.mall.service.TransactionService;
import com.mall.service.UserService;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value = "/transaction/")
@NoArgsConstructor
public class TransactionController {
    BasketService basketService;
    UserService userService;
    ProductService productService;
    TransactionService transactionService;

    @Autowired
    public TransactionController(BasketService basketService, UserService userService, ProductService productService, TransactionService transactionService) {
        this.transactionService = transactionService;
        this.userService = userService;
        this.productService = productService;
        this.basketService = basketService;
    }

    @GetMapping("showTransaction/{id}")
    public String showAllTransaction(@PathVariable int id, Model model) {
        List<TransactionDTO> transactList = transactionService.selectAll(id);
        model.addAttribute("transaction", transactList);
        return "transaction/TransactionPage";
    }

    @GetMapping("transactionDetail/{id}")
    public String showTransactionDetail(@PathVariable int id) {
        return "transaction/TransactionDetail";
    }

    @RequestMapping("transferSelectedTransaction")
    public String transferSelectedTransaction(
            @RequestParam(value = "product-check", required = false)
            List<Integer> value, HttpServletRequest request, HttpSession session) {
        System.out.println("value = " + value);
        return "transaction/TransactionPage";
    }


    @PostMapping("addAllTransaction/{id}")
    public String addTransaction(@PathVariable String id, HttpSession session) {
        return "redirect:/transaction/showTransaction/";
    }

    @GetMapping("addOneTransaction/{userId}/{productId}/{basketId}/{count}")
    public String addOneTransaction(@PathVariable int userId, @PathVariable int productId, @PathVariable int basketId, @PathVariable int count,
                                    HttpServletRequest request, HttpSession session) {

        System.out.println("productId = " + productId + ", user = " + userId + ", basketId = " + basketId + ", count = " + count);
        TransactionDTO transaction = new TransactionDTO();
        ProductDTO productDTO = productService.selectOne(productId);

        int price = productDTO.getPrice();

        transaction.setProductId(productId);
        transaction.setUserId(userId);
        transaction.setCount(count);
        transaction.setPrice(price * count);

        System.out.println("transactionDTO = " + transaction);

//        transactionService.addTransaction(transaction);
//        basketService.deleteOneBasket(transaction.getProductId());

        return "redirect:/basket/showBasket";
    }

    @GetMapping("showOneTransaction/{id}")
    public String showOneTransaction(@PathVariable int id, Model model) {
        TransactionDTO transaction = transactionService.selectOneTransaction(id);
        if (transaction != null) {
            model.addAttribute("transaction", transaction);
            return "transaction/transactionDetail";
        } else {
            return "redirect:/transaction/TransactionPage";
        }
    }
}
