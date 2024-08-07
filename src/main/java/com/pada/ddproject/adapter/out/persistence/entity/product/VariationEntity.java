package com.pada.ddproject.adapter.out.persistence.entity.product;

@SuppressWarnings("java:S1068") // Suppress warning about unused private fields until logic is implemented
public class VariationEntity { // Variation vs OrderItem?
    private String variationId;
    private String size;
    private String color;
    private String material;
    private String sku;
    private Double price; // Double vs BigDecimal
    private Integer inventoryQuantity;
}
