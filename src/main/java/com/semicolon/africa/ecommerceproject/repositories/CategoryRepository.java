package com.semicolon.africa.ecommerceproject.repositories;

import com.semicolon.africa.ecommerceproject.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
