package com.pada.ddproject.domain.model.buyer;

import com.pada.ddproject.domain.model.order.Order;

import java.util.List;

@SuppressWarnings("java:S1068") // Suppress warning about unused private fields until logic is implemented
class OrderHistory {
    private List<Order> orders; // access to other Aggregate Root outside of package
}
