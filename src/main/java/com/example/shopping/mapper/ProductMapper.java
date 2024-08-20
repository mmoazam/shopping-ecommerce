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

    @Mapping(target = "image", source = "image")
    ProductDto toDto(Product product);

    @Mapping(target = "image", source = "image")
    Product toEntity(ProductDto productDto);

    @Mapping(target = "userId", source = "user.id")
    CommentDto toDto(Comment comment);

    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "product", ignore = true)
    Comment toEntity(CommentDto commentDto);


}
