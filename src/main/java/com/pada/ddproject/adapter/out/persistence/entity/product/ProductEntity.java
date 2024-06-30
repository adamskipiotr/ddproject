package com.pada.ddproject.adapter.out.persistence.entity.product;

import java.util.List;

@SuppressWarnings("java:S1068") // Suppress warning about unused private fields until logic is implemented
public class ProductEntity {
    private String productId;
    private String title;
    private String description;
    private String brand;
    private String category;
    private List<VariationEntity> variationEntities;
    private List<CertificationEntity> certificationEntities;
    private Boolean isGlobalListing;
    private List<String> availableCurrencies; //is this field needed?
    private List<String> shippingCountries;
}
