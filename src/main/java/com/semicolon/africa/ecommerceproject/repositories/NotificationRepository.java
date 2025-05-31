package com.semicolon.africa.ecommerceproject.repositories;

import com.semicolon.africa.ecommerceproject.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer> {

}
