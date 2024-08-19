package com.example.shopping.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDto {
    private Long id;

    @NotBlank(message = "Product name cannot be blank")
    private String name;

    @NotBlank(message = "Description name cannot be blank")
    private String description;

    @Positive(message = "Cannot be negative")
    private BigDecimal price;

    @PositiveOrZero(message = "Cannot be negative")
    private Integer quantity;

    private List<CommentDto> comments;
}
