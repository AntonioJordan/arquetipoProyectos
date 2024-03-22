package com.inditex.test.inditex.domain.models;

import lombok.Data;

@Data
public class Product {

    private Long productId;
    private String productName;
    private String description;

}