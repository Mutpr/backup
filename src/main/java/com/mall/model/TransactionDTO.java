package com.mall.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class TransactionDTO {
    private int transactionID;
    private Timestamp transactionTime;
    private int basketId;
    private int count;
    private int productId;
}
