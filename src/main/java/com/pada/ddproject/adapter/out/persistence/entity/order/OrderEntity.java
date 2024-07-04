package com.pada.ddproject.adapter.out.persistence.entity.order;

import com.pada.ddproject.domain.model.buyer.Buyer;
import com.pada.ddproject.domain.model.seller.Seller;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SuppressWarnings("java:S1068") // Suppress warning about unused private fields until logic is implemented
@Entity
@Getter
@Setter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order")
public class OrderEntity {

    @Id
    @SequenceGenerator(name = "order_id_sequence", sequenceName = "order_id_seq", allocationSize = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_id_sequence")
    private String id;

   // @ManyToOne
   // private Buyer buyer; // external aggregate root call

    //private Seller seller;

    private List<OrderItemEntity> orderItemEntities;

    private PaymentMethodEntity paymentMethodEntity;

    private BigDecimal totalCost; // needed as a field or calculate from partials?

    private OrderStatus orderStatus;

    private LocalDateTime orderDate;

    private ShippingDetailEntity shippingDetailEntity;
}
