package com.mall.model;


import lombok.Data;

@Data
public class UserBasketDTO {
    private int basketId;
    private int transactionId;
    private int userId;
    private int productId;
}
