package com.pada.ddproject.adapter.out.persistence.entity.buyer;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@SuppressWarnings("java:S1068") // Suppress warning about unused private fields until logic is implemented
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BuyerEntity {
    private String buyerId;
    private BuyerProfileEntity profile;
    private OrderHistoryEntity orderHistoryEntity;
    private SearchPreferenceEntity searchPreferences;
}
