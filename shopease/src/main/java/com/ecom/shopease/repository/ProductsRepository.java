package com.ecom.shopease.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.shopease.model.Products;

@Repository
public interface ProductsRepository extends  JpaRepository<Products,Long > {
    Optional<Products> findByName(String name);
}
