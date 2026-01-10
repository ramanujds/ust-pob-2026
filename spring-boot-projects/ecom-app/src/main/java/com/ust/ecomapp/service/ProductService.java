package com.ust.ecomapp.service;

import com.ust.ecomapp.model.Product;
import com.ust.ecomapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepo;

    public ProductService(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public Product saveProduct(Product product) {
        return productRepo.saveProduct(product);
    }

    public List<Product> getProducts() {
        return productRepo.getProducts();
    }

    public Product getProductById(long id) {

        return productRepo.getProductById(id);
    }

    public void deleteProduct(long id) {
        productRepo.deleteProduct(id);
    }

}
