package com.semicolon.africa.ecommerceproject.repositories;

import com.semicolon.africa.ecommerceproject.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserByEmail(String email);
}
