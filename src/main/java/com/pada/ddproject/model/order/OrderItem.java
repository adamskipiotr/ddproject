package com.pada.ddproject.model.order;

import java.math.BigDecimal;

class OrderItem {
    private String productId; // call to Product Aggregare root - is it allowed to do it not from root?
    private String sku;
    private String name;
    private BigDecimal price;
    private Integer quantity;


    public String returnHelloStirng(){
        return "hello";
    }
}
