package com.example.shopping.mapper;

import com.example.shopping.dto.CommentDto;
import com.example.shopping.dto.ProductDto;
import com.example.shopping.model.Comment;
import com.example.shopping.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "productId", source = "product.id")
    ProductDto toDto(Product product);

    @Mapping(target = "", source = "")
    Product toEntity(ProductDto productDto);

}
