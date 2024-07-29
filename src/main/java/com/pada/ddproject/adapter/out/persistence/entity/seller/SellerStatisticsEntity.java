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
@Table(name = "seller_statistics")
class SellerStatisticsEntity {

    @Id
    @SequenceGenerator(name = "seller_statistics_id_sequence", sequenceName = "seller_statistics_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seller_statistics_id_sequence")
    private Long id;

    private Integer totalSales;

    private Integer totalReviews;

    private Double averageRating;

    //Good practice - mapping ID with parent
    //see:
    @MapsId
    @JoinColumn(name = "id") // owning side
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private SellerEntity seller;
}
