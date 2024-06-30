package com.pada.ddproject.model.order;

@SuppressWarnings("java:S1068") // Suppress warning about unused private fields until logic is implemented
enum OrderStatus {
    PENDING,
    CONFIRMED,
    SHIPPED,
    DELIVERED,
    CANCELLED,
    RETURNED
}
