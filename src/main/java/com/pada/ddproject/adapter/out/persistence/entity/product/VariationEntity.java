package com.pada.ddproject.adapter.out.persistence.entity.product;

import jakarta.persistence.*;
import lombok.*;

@SuppressWarnings("java:S1068") // Suppress warning about unused private fields until logic is implemented
@Entity
@Getter
@Setter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "variation")
public class VariationEntity { // Variation vs OrderItem?
    @Id
    @SequenceGenerator(name = "variation_id_sequence", sequenceName = "variation_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "variation_id_sequence")
    private Long id;

    private String size;

    private String color;

    private String material;

    private String sku;

    private Double price; // Double vs BigDecimal

   private Integer inventoryQuantity;

    //Good practice - bidirectional ManyToOne
    //https://medium.com/@rajibrath20/the-best-way-to-map-a-onetomany-relationship-with-jpa-and-hibernate-dbbf6dba00d3
    @ManyToOne(fetch = FetchType.LAZY)
    private ProductEntity product;
}
