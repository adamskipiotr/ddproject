package com.pada.ddproject.adapter.out.persistence.entity.seller;

import com.pada.ddproject.domain.model.seller.Seller;
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

    @Id
    @SequenceGenerator(name = "seller_profile_id_sequence", sequenceName = "seller_profile_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seller_profile_id_sequence")
    private Long id;

    private String name;

    private String email;

    private String phoneNumber;

    private String address;

    //Good practice - mapping ID with parent
    //see:
    @MapsId
    @JoinColumn(name = "id") // owning side
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private SellerEntity seller;
}
