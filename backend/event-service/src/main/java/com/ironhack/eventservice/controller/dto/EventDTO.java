package com.ironhack.eventservice.controller.dto;

import com.ironhack.eventservice.enums.Region;
import com.ironhack.eventservice.enums.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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

}
