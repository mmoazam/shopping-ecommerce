package com.example.shopping.dto;

import lombok.Data;

@Data
public class CommentDto {
    private Long id;
    private String content;
    private Integer score;
    private Long userId;
}
