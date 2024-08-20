package com.example.shopping.repositories;

import com.example.shopping.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long > {

    Optional<User> findByEmail(String email);
}
