package com.shop.myshop.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Delivery_Types")
public class DeliveryType {
    private Long id;

    private String name;

    private List<Order> orders;

    @OneToMany(mappedBy = "deliveryType", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public DeliveryType(){}

    public DeliveryType(String name) {
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
