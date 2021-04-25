package com.shop.myshop.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Manufacturers")
public class Manufacturer {
    private Long id;

    private String name;
    private List<Product> products;

    @OneToMany(mappedBy = "manufacturer", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Manufacturer(){}

    public Manufacturer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }
}
