package com.pada.ddproject.model;

import com.pada.ddproject.model.user.Client;
import com.pada.ddproject.model.user.Seller;

import java.time.LocalDateTime;
import java.util.List;

/** Aggregate Root **/
public class Sale {
    private Seller seller;
    private List<Product> products;
    private Client client;
    private String status;
    private Location from;
    private Location to;
    private String paymentMethod;
    private String insurance;
    private boolean deliveryConfirmation;
    private LocalDateTime saleDate;
    private LocalDateTime expectedDeliveryDate;
    private LocalDateTime realDeliveryDate;
}
