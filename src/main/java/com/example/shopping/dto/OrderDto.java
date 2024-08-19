package com.example.shopping.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDto {
    private Long id;
    private Long userId;
    private String address;
    private String phoneNumber;
    private Order.OrderStaus status;
    private LocalDateTime createdAt;
    private List<OrderItemDto> orderItems;

}
