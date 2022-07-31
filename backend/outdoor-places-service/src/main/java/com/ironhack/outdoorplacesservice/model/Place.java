package com.ironhack.outdoorplacesservice.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.ironhack.outdoorplacesservice.enums.Category;
import com.ironhack.outdoorplacesservice.enums.Region;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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

}
