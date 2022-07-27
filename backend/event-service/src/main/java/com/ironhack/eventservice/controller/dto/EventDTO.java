package com.ironhack.eventservice.controller.dto;

import com.ironhack.eventservice.enums.Region;
import com.ironhack.eventservice.enums.Type;

import javax.persistence.*;


public class EventDTO {


    private Long id;

    private Long userId;
    private String name;


    private String description;
    private String address;
    @Enumerated(EnumType.STRING)
    private Region region;
    private double latitude;
    private double longitude;

    private String date;
    private String time;
    private double price;

    @Enumerated(EnumType.STRING)
    private Type type;

    public EventDTO() {
    }

    public EventDTO(Long userId, String name, String description, String address, Region region, double latitude, double longitude, String date, String time, double price, Type type) {
        this.userId = userId;
        this.name = name;
        this.description = description;
        this.address = address;
        this.region = region;
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
        this.time = time;
        this.price = price;
        this.type = type;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
