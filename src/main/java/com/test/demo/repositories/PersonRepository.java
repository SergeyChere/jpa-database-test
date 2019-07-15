package com.test.demo.repositories;

import com.test.demo.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<OrderEntity, Long> {
}
