package com.mall.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class TransactionDTO {
    private int transactionId;
    private int productId;
    private int userId;
    private int count;
    private int price;
    private String address;
    private int status;
    private Timestamp transactionAddDate;
}
