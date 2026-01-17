package com.ust.ecomapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "supplier_id")
    private long id;
    @Column(name = "supplier_name")
    private String name;
    private String location;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Product> product;

}
