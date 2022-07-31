package com.ironhack.eventservice.model;

import com.ironhack.eventservice.enums.Region;
import com.ironhack.eventservice.enums.Type;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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



    public Event(Long userId, String name, String description, String address, Region region, double latitude, double longitude, String date, String time, double price, Type type) {
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
