package com.pada.ddproject.adapter.out.persistence.entity.buyer;

import com.pada.ddproject.domain.model.buyer.Buyer;
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
@Table(name = "buyer_profile")
class BuyerProfileEntity {

    @Id
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
    private BuyerEntity buyer;
}
