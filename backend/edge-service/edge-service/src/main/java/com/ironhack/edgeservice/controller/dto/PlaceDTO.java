package com.ironhack.edgeservice.controller.dto;

import com.ironhack.edgeservice.enums.Category;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

public class PlaceDTO {

    private Long id;

    @NotNull
    private Long userId;

    @NotNull
    private String name;

    @NotNull
    private String description;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Category category;
    private String address;
    @NotNull
    private String region;
    private String latitude;
    private String longitude;
    private String image;

    public PlaceDTO() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }



}
