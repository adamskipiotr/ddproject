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
public class ShippingCountryEntity implements Comparable<ShippingCountryEntity> {

    @Id
    @SequenceGenerator(name = "shipping_country_id_sequence", sequenceName = "shipping_country_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shipping_country_id_sequence")
    private Long id;

    private String name;

    @Override
    public int compareTo(ShippingCountryEntity o) {
        return name.compareTo(o.getName());
    }
}
