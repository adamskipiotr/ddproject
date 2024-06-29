package com.pada.ddproject.model.order;

import java.time.LocalDateTime;

class ShippingDetail {
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String shippingMethod;
    private LocalDateTime estimatedDeliveryDate;
    private LocalDateTime realDeliveryDate;
}
