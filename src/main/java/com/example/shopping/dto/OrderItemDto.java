package com.example.shopping.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDto {
    private Long id;
    private Long productId;
    private Integer quantity;
    private BigDecimal price;
}
