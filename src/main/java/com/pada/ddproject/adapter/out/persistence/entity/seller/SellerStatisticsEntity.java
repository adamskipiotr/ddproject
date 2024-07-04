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
@Table(name = "seller_statistics")
class SellerStatisticsEntity {

    @SequenceGenerator(name = "seller_statistics_id_sequence", sequenceName = "seller_statistics_id_seq", allocationSize = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seller_statistics_id_sequence")
    private String id;

    private Integer totalSales;

    private Integer totalReviews;

    private Double averageRating;
}
