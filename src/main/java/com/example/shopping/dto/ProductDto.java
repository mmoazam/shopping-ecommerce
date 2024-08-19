package com.example.shopping.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDto {
    private Long Id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer quantity;
    private List<CommentDto> comments;
}
