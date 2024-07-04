package com.pada.ddproject.adapter.out.persistence.entity.buyer;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@SuppressWarnings("java:S1068") // Suppress warning about unused private fields until logic is implemented
@Entity
@Getter
@Setter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "search_preference")
class SearchPreferenceEntity {
    private List<String> preferences;
    private Boolean ecoFriendlyFilterEnabled;
}
