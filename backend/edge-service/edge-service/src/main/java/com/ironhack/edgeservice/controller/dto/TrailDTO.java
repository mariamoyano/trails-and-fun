package com.ironhack.edgeservice.controller.dto;

import com.ironhack.edgeservice.enums.Difficulty;
import com.ironhack.edgeservice.enums.Region;
import com.sun.istack.NotNull;
import lombok.Data;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class TrailDTO {

    private Long userId;

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


}
