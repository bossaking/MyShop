package com.shop.myshop.models;

import javax.persistence.*;

@Entity
@Table(name = "Orders_Products")
public class OrderProduct {

    private Long id;
    private Order order;
    private Product product;

    private float quantity;

    public OrderProduct(){}

    public OrderProduct(Order order, Product product, float quantity) {
        this.order = order;
        this.product = product;
        this.quantity = quantity;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
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
