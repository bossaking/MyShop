package com.shop.myshop.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Streets")
public class Street {
    private Long id;

    private String name;
    private StreetType streetType;

    private List<Address> addresses;

    @OneToMany(mappedBy = "street", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Street(){}

    public Street(String name, StreetType streetType) {
        this.name = name;
        this.streetType = streetType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name = "street_type_id")
    public StreetType getStreetType() {
        return streetType;
    }

    public void setStreetType(StreetType streetType) {
        this.streetType = streetType;
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
