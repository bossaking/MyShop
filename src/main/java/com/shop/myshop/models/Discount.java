package com.shop.myshop.models;

import javax.persistence.*;

@Entity
@Table(name = "Discounts")
public class Discount {
    private Long id;

    private String discountCode;
    private int discountValue;

    public Discount(){}

    public Discount(String code, int value) {
        this.discountCode = code;
        this.discountValue = value;
    }

    public String getCode() {
        return discountCode;
    }

    public void setCode(String code) {
        this.discountCode = code;
    }

    public int getValue() {
        return discountValue;
    }

    public void setValue(int value) {
        this.discountValue = value;
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
