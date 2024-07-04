package com.pada.ddproject.adapter.out.persistence.entity.buyer;

import com.pada.ddproject.domain.model.order.Order;

import java.util.List;

@SuppressWarnings("java:S1068") // Suppress warning about unused private fields until logic is implemented

class OrderHistoryEntity {
    private List<Order> orders; // access to other Aggregate Root outside of package
}
