package com.ironhack.trailsservice.controller.dto;

import com.ironhack.trailsservice.enums.Difficulty;
import com.ironhack.trailsservice.enums.Region;
import com.ironhack.trailsservice.model.Comment;
import lombok.*;

import javax.persistence.*;

@Data
public class TrailDTO {

    private Long id;

    private Long userId;

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

    private Comment comment;



    public TrailDTO(Long userId, String name, String description, Difficulty difficulty, double length, String address, Region region, double latitude, double longitude, String image) {
        this.userId = userId;
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

    public TrailDTO(Long userId, String name, String description, Difficulty difficulty, double length, String address, Region region, double latitude, double longitude, String image, Comment comment) {
        this.userId = userId;
        this.name = name;
        this.description = description;
        this.difficulty = difficulty;
        this.length = length;
        this.address = address;
        this.region = region;
        this.latitude = latitude;
        this.longitude = longitude;
        this.image = image;
        this.comment = comment;
    }
}
