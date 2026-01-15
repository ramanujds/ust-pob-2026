package com.ust.ecomapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class Product {

    @Id
    private long id;
    private String name;
    private double price;

}
