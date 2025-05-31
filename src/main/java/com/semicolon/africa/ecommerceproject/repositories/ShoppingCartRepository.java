package com.semicolon.africa.ecommerceproject.repositories;

import com.semicolon.africa.ecommerceproject.models.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {

}
