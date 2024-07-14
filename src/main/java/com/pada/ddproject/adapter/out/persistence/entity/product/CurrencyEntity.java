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
@Table(name = "currency")
public class CurrencyEntity implements Comparable<CurrencyEntity> { // develop into Value Object

    @Id
    @SequenceGenerator(name = "currency_id_sequence", sequenceName = "currency_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "currency_id_sequence")
    private Long id;

    private String name;

    @Override
    public int compareTo(CurrencyEntity o) {
        return name.compareTo(o.getName());
    }
}
