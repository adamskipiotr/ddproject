package com.pada.ddproject.model.buyer;

import com.pada.ddproject.model.order.Order;

import java.util.List;

class OrderHistory {
    private List<Order> orders; // access to other Aggregate Root outside of package
}
