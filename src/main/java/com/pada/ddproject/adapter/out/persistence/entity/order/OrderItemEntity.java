package com.pada.ddproject.adapter.out.persistence.entity.order;

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
class OrderItemEntity {

    @Id
    @SequenceGenerator(name = "product_id_sequence", sequenceName = "product_id_seq", allocationSize = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_sequence")
    private Long id;


    private String productId; // call to Product Aggregare root - is it allowed to do it not from root?

    private String sku;

    private String name;

    private BigDecimal price;

    private Integer quantity;
}
