package com.ust.ecomapp.config;

import com.ust.ecomapp.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    @Primary
    ProductRepository getProductRepository(){
        return new ProductRepository();
    }

}
