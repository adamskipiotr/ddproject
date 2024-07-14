package com.pada.ddproject.adapter.out.persistence.entity.order;

import com.pada.ddproject.domain.model.buyer.Buyer;
import com.pada.ddproject.domain.model.order.Order;
import com.pada.ddproject.domain.model.seller.Seller;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.EnumType.STRING;

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
    @SequenceGenerator(name = "order_id_sequence", sequenceName = "order_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_id_sequence")
    private Long id;

   // @ManyToOne
   // private Buyer buyer; // external aggregate root call

    //private Seller seller;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true)
    @Builder.Default // what for
    private List<OrderItemEntity> orderItems = new ArrayList<>();

    //Good practice - bidirectional ManyToOne
    //https://medium.com/@rajibrath20/the-best-way-to-map-a-onetomany-relationship-with-jpa-and-hibernate-dbbf6dba00d3
    @ManyToOne(fetch = FetchType.LAZY)
    private PaymentMethodEntity paymentMethod;

    private BigDecimal totalCost; // needed as a field or calculate from partials?

    @Enumerated(STRING)
    private OrderStatus orderStatus;

    private LocalDateTime orderDate;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ShippingDetailEntity shippingDetail;
}
