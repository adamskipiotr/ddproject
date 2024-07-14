package com.pada.ddproject.adapter.out.persistence.entity.order;

import com.pada.ddproject.domain.model.order.Order;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@SuppressWarnings("java:S1068") // Suppress warning about unused private fields until logic is implemented
@Entity
@Getter
@Setter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "shipping_detail")
class ShippingDetailEntity {
    @Id
    @SequenceGenerator(name = "shipping_detail_id_sequence", sequenceName = "shipping_detail_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shipping_detail_id_sequence")
    private Long id;

    private String address;

    private String city;

    private String state;

    private String country;

    private String postalCode;

    private String shippingMethod;

    private LocalDateTime estimatedDeliveryDate;

    private LocalDateTime realDeliveryDate;

    //Good practice - mapping ID with parent
    //see:
    @MapsId
    @JoinColumn(name = "id") // owning side
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private OrderEntity order;
}
