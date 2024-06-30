package com.pada.ddproject.adapter.out.persistence.entity.order;

import java.math.BigDecimal;

class OrderItemEntity {
    private String productId; // call to Product Aggregare root - is it allowed to do it not from root?
    private String sku;
    private String name;
    private BigDecimal price;
    private Integer quantity;
}
