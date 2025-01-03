package com.example.productservice.controllers;

import com.example.productservice.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

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
        return null;
    }
    /*
    POST/products: create a new product
     */
    @PostMapping("/products")
    public void createProduct(){

    }
}
