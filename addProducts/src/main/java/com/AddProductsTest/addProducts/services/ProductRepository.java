package com.AddProductsTest.addProducts.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AddProductsTest.addProducts.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
