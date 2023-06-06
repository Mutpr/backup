package com.mall.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BasketDTO {
    private int basketId;
    private Timestamp basketAddDate;
    private int userId;
    private int count;
    private int productId;
    private int totalPrice;
}
