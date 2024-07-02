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
    @SequenceGenerator(name = "variation_id_sequence", sequenceName = "variation_id_seq", allocationSize = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "variation_id_sequence")
    private Long variationId;

    private String size;

    private String color;

    private String material;

    private String sku;

    private Double price; // Double vs BigDecimal

   private Integer inventoryQuantity;
}
