package com.pada.ddproject.adapter.out.persistence.entity.buyer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private Long buyerId;
//    private BuyerProfileEntity profile;
//    private OrderHistoryEntity orderHistoryEntity;
//    private SearchPreferenceEntity searchPreferences;
}
