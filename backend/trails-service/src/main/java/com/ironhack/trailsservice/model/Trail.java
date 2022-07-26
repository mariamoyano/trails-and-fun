package com.ironhack.trailsservice.model;

import com.ironhack.trailsservice.enums.Difficulty;
import com.ironhack.trailsservice.enums.Region;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Trail {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private Long UserId;


    private String name;

    private String description;
    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;
    private double length;

    private String address;

    @Enumerated(EnumType.STRING)
    private Region region;
    private double latitude;
    private double longitude;

    private String image;

    public Trail() {
    }

    public Trail(Long userId, String name, String description, Difficulty difficulty, double length, String address, Region region, double latitude, double longitude, String image) {
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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
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
