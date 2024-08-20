package com.example.shopping.mapper;

import com.example.shopping.dto.CartDto;
import com.example.shopping.dto.CartItemDto;
import com.example.shopping.model.Cart;
import com.example.shopping.model.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {

    @Mapping(target = "userId", source = "user.id")
    CartDto toDto(Cart cart);

    @Mapping(target = "user.id", source = "userId")
    Cart toEntity(CartDto cartDto);

    @Mapping(target = "productId", source = "product.id")
    CartItemDto toDto(CartItem cartItem);

    @Mapping(target = "product.id", source = "productId")
    CartItem toEntity(CartItemDto cartItemDto);
}
