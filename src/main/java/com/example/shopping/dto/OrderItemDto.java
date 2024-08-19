package com.example.shopping.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDto {

    private Long id;

    private Long productId;

    @Positive
    private Integer quantity;

    @Positive
    private BigDecimal price;
}
