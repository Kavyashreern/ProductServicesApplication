package com.example.productservice.services;

import com.example.productservice.dtos.CreateProductDto;
import com.example.productservice.models.Product;

import java.util.List;

public interface ProductServices {

    List<Product> getAllProducts();
    Product getSingleProduct(long id);
    void CreateProduct(CreateProductDto createProductDto);
}
