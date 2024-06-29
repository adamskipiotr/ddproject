package com.pada.ddproject.model.order;

import com.pada.ddproject.model.buyer.Buyer;
import com.pada.ddproject.model.seller.Seller;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private String orderId;
    private Buyer buyer; // external aggregate root call
    private Seller seller;
    private List<OrderItem> orderItems;
    private PaymentMethod paymentMethod;
    private BigDecimal totalCost; // needed as a field or calculate from partials?
    private OrderStatus orderStatus;
    private LocalDateTime orderDate;
    private ShippingDetail shippingDetail;
}
