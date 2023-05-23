package com.mall.model;


import lombok.Data;

@Data
public class BasketDTO {
    private int basketId;
    private int transactionId;
    private int userId;
    private int productId;
}
