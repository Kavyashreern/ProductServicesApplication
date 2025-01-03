package com.example.productservice.controllers;

import com.example.productservice.dtos.CreateProductDto;
import com.example.productservice.models.Product;
import com.example.productservice.services.ProductServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private ProductServices productServices;

    public ProductController(ProductServices productServices) {
        this.productServices = productServices;
    }
    /*
    Api :methods in controllers
     */
    /*
    GET/products:get all products
     */
    //@RequestMapping(value="/products")
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return null;
    }
    /*
    GET/products/{id}
     */
    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id") long id){
        return productServices.getSingleProduct(id);
    }
    /*
    POST/products: create a new product

     */
    @PostMapping("/products")
    public void createProduct(CreateProductDto createProductDto){
        productServices.CreateProduct(createProductDto);
    }
}
