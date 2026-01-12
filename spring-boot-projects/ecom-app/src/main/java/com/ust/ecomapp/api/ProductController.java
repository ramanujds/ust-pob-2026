package com.ust.ecomapp.api;

import com.ust.ecomapp.model.Product;
import com.ust.ecomapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getAllProducts() {
        return service.getProducts();
    }


    @GetMapping("/search")
    public Product getProduct(@RequestParam("id") long id) {
        return service.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable long id) {
        service.deleteProduct(id);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    // GET : get product by name
    // GET : get product in price range


}
