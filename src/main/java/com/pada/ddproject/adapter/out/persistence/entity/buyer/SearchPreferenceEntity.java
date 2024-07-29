package com.pada.ddproject.adapter.out.persistence.entity.buyer;

import jakarta.persistence.*;
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

    @Id
    private Long id;

    @ElementCollection
    @CollectionTable(name = "preferences", joinColumns = @JoinColumn(name = "search_preference_id"))
    @Column(name = "value")
    private List<String> preferences;


    private Boolean ecoFriendlyFilterEnabled;

    //Good practice - mapping ID with parent
    //see:
    @MapsId
    @JoinColumn(name = "id") // owning side
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private BuyerEntity buyer;
}
