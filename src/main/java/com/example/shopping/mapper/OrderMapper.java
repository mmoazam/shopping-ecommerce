package com.example.shopping.mapper;

import com.example.shopping.dto.OrderDto;
import com.example.shopping.dto.OrderItemDto;
import com.example.shopping.model.Order;
import com.example.shopping.model.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "orderItems", source = "items")
    OrderDto toDto(Order order);

    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "items", source = "orderItems")
    Order toEntity(OrderDto orderDto);


    List<OrderDto> toDtos(List<Order> orders);

    List<Order> toEntities(List<OrderDto> orderDtos);

    @Mapping(target = "productId", source = "product.id")
    OrderItemDto toOrderItemDto(OrderItem orderItem);

    @Mapping(target = "product.id", source = "productId")
    OrderItem toOrderItemEntity(OrderItemDto orderItemDto);

    List<OrderItemDto> toOrderItemDtos(OrderItem orderItem);

    List<OrderItem> toOrderItemEntities(List<OrderItemDto> orderItemDtos);
}
