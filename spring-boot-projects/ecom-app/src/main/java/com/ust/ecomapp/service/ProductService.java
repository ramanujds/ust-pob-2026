package com.ust.ecomapp.service;

import com.ust.ecomapp.model.Product;
import com.ust.ecomapp.repository.ProductRepository;

import java.util.List;

public class ProductService {

    private ProductRepository productRepository = new ProductRepository();

    public Product saveProduct(Product product) {
        return productRepository.saveProduct(product);
    }

    public List<Product> getProducts() {
        return productRepository.getProducts();
    }

    public Product getProductById(long id) {

        return productRepository.getProductById(id);
    }

    public void deleteProduct(long id) {
        productRepository.deleteProduct(id);
    }

}
