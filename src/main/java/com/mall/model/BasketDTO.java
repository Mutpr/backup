package com.mall.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BasketDTO {
    private int basketId;
    private Timestamp basketTime;
    private int userId;
    private int count;
    private int productId;
}
