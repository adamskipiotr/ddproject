package com.pada.ddproject.adapter.out.persistence.entity.buyer;

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
@Table(name = "buyer")
public class BuyerEntity {

    @Id
    @SequenceGenerator(name = "buyer_id_sequence", sequenceName = "buyer_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "buyer_id_sequence")
    private Long id;

    @OneToOne(mappedBy = "buyer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private BuyerProfileEntity profile;

    @OneToOne(mappedBy = "buyer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private OrderHistoryEntity orderHistoryEntity;

    @OneToOne(mappedBy = "buyer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private SearchPreferenceEntity searchPreferences;
}
