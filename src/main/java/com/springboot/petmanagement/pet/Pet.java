package com.springboot.petmanagement.pet;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@javax.persistence.Entity
@javax.persistence.Table
public class Pet {
    @javax.persistence.Id
    @SequenceGenerator(
            name = "pet_sequence",
            sequenceName = "pet_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "pet_sequence"
    )
    private Integer id;
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Pet type is required")

    private String type;
    @NotBlank(message = "Fur color is required")

    private String color;
    private String country;
    private Integer owner;

    public Pet() {
    }

    public Pet(Integer id, String name, String type, String color, String country, Integer owner) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.color = color;
        this.country = country;
        this.owner = owner;
    }

    public Pet(String name, String type, String color, String country, Integer owner) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.country = country;
        this.owner = owner;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getOwner() { return owner; }

    public void setOwner(Integer owner) {this.owner = owner;}

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", country='" + country + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
