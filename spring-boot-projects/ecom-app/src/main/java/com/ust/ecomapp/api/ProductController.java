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


    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") long id) {
        return service.getProductById(id);
    }

    @GetMapping("/search")
    public List<Product> findProduct(@RequestParam("name") String name,
                                     @RequestParam(value = "price", required = false) Double price) {
        if (price != null){
            return service.findProductByName(name,price);
        }
        return service.findProductByName(name);
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

    @GetMapping("/price")
    List<Product> findProductInPriceRange(@RequestParam("min") double min,
                                          @RequestParam("max") double max){
        return service.findProductInPriceRange(min,max);
    }

    // product with name and max price



}
