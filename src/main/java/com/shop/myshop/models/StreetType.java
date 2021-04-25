package com.shop.myshop.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Street_Types")
public class StreetType {
    private Long id;

    private String name;
    private List<Street> streets;


    @OneToMany(mappedBy = "streetType", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Street> getStreets() {
        return streets;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }

    public StreetType(){}

    public StreetType(String name) {
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
