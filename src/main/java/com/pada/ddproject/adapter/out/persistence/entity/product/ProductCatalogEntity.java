package com.pada.ddproject.adapter.out.persistence.entity.product;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S1068") // Suppress warning about unused private fields until logic is implemented
@Entity
@Getter
@Setter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_catalog")
public class ProductCatalogEntity {

    @Id
    @SequenceGenerator(name = "product_catalog_id_sequence", sequenceName = "product_catalog_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_catalog_id_sequence")
    private Long id;

    @OneToMany(mappedBy = "productCatalog", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true)
    @Builder.Default
    private List<ProductEntity> products = new ArrayList<>();
}
