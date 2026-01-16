package com.ust.ecomapp.service;

import com.ust.ecomapp.exception.ResourceNotFoundException;
import com.ust.ecomapp.model.Product;
import com.ust.ecomapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
        if (productRepo.existsById(product.getId())){
            throw new RuntimeException("...");
        }
        return productRepo.save(product);
    }

    public Product updateProduct(long id, Product product) {
        Product existing = getProductById(id);
        if (product.getName() != null){
            existing.setName(product.getName());
        }
        if (product.getPrice() != 0){
            existing.setPrice(product.getPrice());
        }
        return productRepo.save(existing);
    }

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(long id) {
        return productRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Product with Id:"+id+" Not found"));
    }

    public void deleteProduct(long id) {
        productRepo.deleteById(id);
    }


    public List<Product> findProductByName(String name) {
        return productRepo.findByNameContaining(name);
    }

    public List<Product> findProductByName(String name, double price) {
        return productRepo.findByNameContainingAndPriceLessThan(name,price);
    }

    public List<Product> findProductInPriceRange(double min, double max) {
        return productRepo.findByPriceRange(min,max);
    }




}
