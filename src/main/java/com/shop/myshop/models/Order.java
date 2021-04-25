package com.shop.myshop.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Orders")
public class Order {
    private Long id;

    private Discount discount;
    private Client client;
    private PaymentType paymentType;
    private DeliveryType deliveryType;
    private Date orderDate;
    private float deliveryPrice;

    private List<OrderProduct> orderProducts;

    public Order(){}

    public Order(Discount discount, Client client, PaymentType paymentType, DeliveryType deliveryType, Date orderDate, float deliveryPrice, List<OrderProduct> orderProducts) {
        this.discount = discount;
        this.client = client;
        this.paymentType = paymentType;
        this.deliveryType = deliveryType;
        this.orderDate = orderDate;
        this.deliveryPrice = deliveryPrice;
        this.orderProducts = orderProducts;
    }

    @ManyToOne
    @JoinColumn(name = "discount_id")
    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @ManyToOne
    @JoinColumn(name = "client_id")
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @ManyToOne
    @JoinColumn(name = "payment_type_id")
    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    @ManyToOne
    @JoinColumn(name = "delivery_type_id")
    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(DeliveryType deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public float getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(float deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    @OneToMany(mappedBy = "order")
    public List<OrderProduct> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(List<OrderProduct> orderProducts) {
        this.orderProducts = orderProducts;
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
