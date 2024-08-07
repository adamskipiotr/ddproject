package com.pada.ddproject.domain.model.order;

import java.time.LocalDateTime;

@SuppressWarnings("java:S1068") // Suppress warning about unused private fields until logic is implemented
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
