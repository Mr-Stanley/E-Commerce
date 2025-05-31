package com.semicolon.africa.ecommerceproject.repositories;

import com.semicolon.africa.ecommerceproject.models.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
