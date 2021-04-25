package com.shop.myshop.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Discounts")
public class Discount {
    private Long id;

    private String discountCode;
    private int discountValue;

    private List<Order> orders;



    public Discount(){}

    public Discount(String code, int value) {
        this.discountCode = code;
        this.discountValue = value;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public int getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(int discountValue) {
        this.discountValue = discountValue;
    }

    @OneToMany(mappedBy = "discount", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
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
