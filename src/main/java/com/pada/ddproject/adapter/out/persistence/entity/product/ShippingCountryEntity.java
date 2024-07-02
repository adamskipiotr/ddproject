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
@Table(name = "shipping_country")
public class ShippingCountryEntity {

    @Id
    @SequenceGenerator(name = "shipping_country_id_sequence", sequenceName = "shipping_country_id_seq", allocationSize = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shipping_country_id_sequence")
    private Long currencyId;

    private String name;

}
