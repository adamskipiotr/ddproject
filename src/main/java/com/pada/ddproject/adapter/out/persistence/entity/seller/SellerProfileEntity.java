package com.pada.ddproject.adapter.out.persistence.entity.seller;

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
@Table(name = "seller_profile")
class SellerProfileEntity {

    @SequenceGenerator(name = "seller_profile_id_sequence", sequenceName = "seller_profile_id_seq", allocationSize = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seller_profile_id_sequence")
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
}
