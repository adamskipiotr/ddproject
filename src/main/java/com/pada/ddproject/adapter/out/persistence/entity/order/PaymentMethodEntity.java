package com.pada.ddproject.adapter.out.persistence.entity.order;

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
@Table(name = "payment_method")
class PaymentMethodEntity {

    @Id
    @SequenceGenerator(name = "product_id_sequence", sequenceName = "product_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_sequence")
    private Long id;

    private String method;

    private String details;

    @OneToMany(mappedBy = "paymentMethod", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true)
    @Builder.Default // what for
    private List<OrderEntity> orders = new ArrayList<>();
}
