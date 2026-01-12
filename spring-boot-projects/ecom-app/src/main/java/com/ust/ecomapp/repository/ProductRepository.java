package com.ust.ecomapp.repository;

import com.ust.ecomapp.model.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("repo1")
public class ProductRepository {

    List<Product> products;

    @PostConstruct
    void init(){
        products = new ArrayList<>();
        products.add(new Product(1,"iPhone 17",83000));
    }

    public Product saveProduct(Product product){
        products.add(product);
        return product;
    }
    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(long id){
        return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void deleteProduct(long id){
        products.removeIf(p-> p.getId() == id);
    }

}
