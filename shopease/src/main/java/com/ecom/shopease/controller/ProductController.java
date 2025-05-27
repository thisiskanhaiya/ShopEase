package com.ecom.shopease.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.shopease.model.Products;
import com.ecom.shopease.service.ProductsService;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductsService productService;
   
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("")
    public Products postProduct(@RequestBody Products product){
        return productService.saveProduct(product);
    }
    @GetMapping("")
    public List<Products> getAllProducts(){
        return productService.getAllProducts();
    } 
    @GetMapping("/{id}")
    public Products getProductById(@PathVariable Long id){
        return productService.findProductById(id);
    }
    
}
