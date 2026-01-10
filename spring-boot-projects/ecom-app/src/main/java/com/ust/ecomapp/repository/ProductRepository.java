package com.ust.ecomapp.repository;

import com.ust.ecomapp.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    List<Product> products = new ArrayList<>();

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
