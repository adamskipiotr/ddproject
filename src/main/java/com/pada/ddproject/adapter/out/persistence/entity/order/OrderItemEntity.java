package com.pada.ddproject.adapter.out.persistence.entity.order;

import com.pada.ddproject.adapter.out.persistence.entity.product.ProductEntity;
import com.pada.ddproject.domain.model.order.Order;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_item")
class OrderItemEntity { // replace with call to Product in OrderEntity?

    @Id
    @SequenceGenerator(name = "product_id_sequence", sequenceName = "product_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_sequence")
    private Long id;

//    private String productId; // call to Product Aggregare root - is it allowed to do it not from root?

    private String sku;

    private String name;

    private BigDecimal price;

    private Integer quantity;

    //Good practice - bidirectional ManyToOne
    //https://medium.com/@rajibrath20/the-best-way-to-map-a-onetomany-relationship-with-jpa-and-hibernate-dbbf6dba00d3
    @ManyToOne(fetch = FetchType.LAZY)
    private OrderEntity order;
}
