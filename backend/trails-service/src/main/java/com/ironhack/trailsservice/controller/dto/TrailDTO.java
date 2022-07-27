package com.ironhack.trailsservice.controller.dto;

import com.ironhack.trailsservice.enums.Difficulty;
import com.ironhack.trailsservice.enums.Region;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

public class TrailDTO {

    private Long id;
    private Long UserId;


    private String name;


    private String description;
    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;
    private String length;

    private String address;

    @Enumerated(EnumType.STRING)
    private Region region;
    private String latitude;
    private String longitude;

    private String image;

    public TrailDTO() {
    }

    public TrailDTO(Long userId, String name, String description, Difficulty difficulty, String length, String address, Region region, String latitude, String longitude, String image) {
        UserId = userId;
        this.name = name;
        this.description = description;
        this.difficulty = difficulty;
        this.length = length;
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
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
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

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
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
