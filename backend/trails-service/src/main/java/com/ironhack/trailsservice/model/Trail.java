package com.ironhack.trailsservice.model;

import com.ironhack.trailsservice.enums.Difficulty;
import com.ironhack.trailsservice.enums.Region;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Trail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


    @OneToMany(mappedBy = "trail", fetch = FetchType.EAGER)
    private List<Comment> comment;


    public Trail(Long userId, String name, String description, Difficulty difficulty, double length, String address, Region region, double latitude, double longitude, String image) {
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
}