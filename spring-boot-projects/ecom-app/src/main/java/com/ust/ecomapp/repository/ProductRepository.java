package com.ust.ecomapp.repository;

import com.ust.ecomapp.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByNameContaining(String name);

    @Query("from Product where price between :min and :max")
    List<Product> findByPriceRange(double min, double max);

    // product with name and max price

    List<Product> findByNameContainingAndPriceLessThan(String name, double price);


}
