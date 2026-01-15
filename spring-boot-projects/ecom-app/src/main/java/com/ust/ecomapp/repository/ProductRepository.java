package com.ust.ecomapp.repository;

import com.ust.ecomapp.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
