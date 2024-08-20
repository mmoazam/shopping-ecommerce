package com.example.shopping.repositories;

import com.example.shopping.model.Order;
import com.example.shopping.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<User, Long> {
    List<Order> findByUserId(Long userId);
}
