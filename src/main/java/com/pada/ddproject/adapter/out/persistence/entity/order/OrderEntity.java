package com.pada.ddproject.adapter.out.persistence.entity.order;

import com.pada.ddproject.domain.model.buyer.Buyer;
import com.pada.ddproject.domain.model.seller.Seller;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SuppressWarnings("java:S1068") // Suppress warning about unused private fields until logic is implemented
public class OrderEntity {
    private String orderId;
    private Buyer buyer; // external aggregate root call
    private Seller seller;
    private List<OrderItemEntity> orderItemEntities;
    private PaymentMethodEntity paymentMethodEntity;
    private BigDecimal totalCost; // needed as a field or calculate from partials?
    private OrderStatus orderStatus;
    private LocalDateTime orderDate;
    private ShippingDetailEntity shippingDetailEntity;
}
