package com.pada.ddproject.adapter.out.persistence.repository;

import com.pada.ddproject.domain.model.buyer.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Long> {
}
