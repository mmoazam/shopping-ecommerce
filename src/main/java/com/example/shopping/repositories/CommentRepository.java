package com.example.shopping.repositories;

import com.example.shopping.model.Comment;
import com.example.shopping.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByProductId(Long productId);
}
