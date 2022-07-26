package com.ironhack.outdoorplacesservice.model;


import com.ironhack.outdoorplacesservice.enums.Category;
import com.ironhack.outdoorplacesservice.enums.Region;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long userId;


    private String name;


    private String description;
    @Enumerated(EnumType.STRING)
    private Category category;
    private String address;


    @Enumerated(EnumType.STRING)
    private Region region;
    private double latitude;
    private double longitude;
    private String image;

    public Place() {
    }


    public Place(Long userId, String name, String description, Category category, String address, Region region, double latitude, double longitude, String image) {
        this.userId = userId;
        this.name = name;
        this.description = description;
        this.category = category;
        this.address = address;
        this.region = region;
        this.latitude = latitude;
        this.longitude = longitude;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }


    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
