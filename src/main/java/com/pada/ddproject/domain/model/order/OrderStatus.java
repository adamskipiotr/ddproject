package com.pada.ddproject.domain.model.order;

@SuppressWarnings("java:S1068") // Suppress warning about unused private fields until logic is implemented
enum OrderStatus {
    PENDING,
    CONFIRMED,
    SHIPPED,
    DELIVERED,
    CANCELLED,
    RETURNED
}
