package com.ecom.shopease.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.shopease.model.Products;
import com.ecom.shopease.repository.ProductsRepository;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productRepo;
    
    public Products saveProduct(Products product){
       return productRepo.save(product);
      
    }

    public List<Products> getAllProducts(){
        return productRepo.findAll();
    }

    public Products findProductById(Long id) {
        return productRepo.findById(id).orElse(null);
    }

}
