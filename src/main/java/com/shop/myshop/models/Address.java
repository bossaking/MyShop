package com.shop.myshop.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Addresses")
public class Address {
    private Long id;

    private City city;
    private Street street;
    private int houseNumber, roomNumber, postalCode;

    private List<Client> clients;

    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public Address(){}

    public Address(City city, Street street, int houseNumber, int roomNumber, int postalCode) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.roomNumber = roomNumber;
        this.postalCode = postalCode;
    }

    @ManyToOne
    @JoinColumn(name = "city_id")
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @ManyToOne
    @JoinColumn(name = "street_id")
    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
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
