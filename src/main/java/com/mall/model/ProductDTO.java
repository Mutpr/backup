package com.mall.model;

import lombok.Data;

@Data
public class ProductDTO {
    private int productId;
    private String productName;
    private String description;
    private int price;
    private String image;
    private String filedata;
}
