package com.pada.ddproject.adapter.out.persistence.entity.buyer;

import com.pada.ddproject.domain.model.buyer.Buyer;
import com.pada.ddproject.domain.model.order.Order;
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
@Table(name = "buyer_order_history")
class OrderHistoryEntity {

    @Id
    private Long id;

  //  private List<Order> orders; // access to other Aggregate Root outside of package

    //Good practice - mapping ID with parent
    //see:
    @MapsId
    @JoinColumn(name = "id") // owning side
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private BuyerEntity buyer;
}
