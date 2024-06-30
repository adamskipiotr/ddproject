package com.pada.ddproject.domain.model.product;

@SuppressWarnings("java:S1068") // Suppress warning about unused private fields until logic is implemented
public class Variation { // Variation vs OrderItem?
    private String variationId;
    private String size;
    private String color;
    private String material;
    private String sku;
    private Double price; // Double vs BigDecimal
    private Integer inventoryQuantity;
}
