package com.pada.ddproject.model.product;

import java.util.List;

public class Product {
    private String productId;
    private String title;
    private String description;
    private String brand;
    private String category;
    private List<Variation> variations;
    private List<Certification> certifications;
    private Boolean isGlobalListing;
    private List<String> availableCurrencies; //is this field needed?
    private List<String> shippingCountries;
}