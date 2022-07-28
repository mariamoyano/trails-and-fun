package com.ironhack.edgeservice.controller.dto;



import com.ironhack.edgeservice.enums.Category;
import com.ironhack.edgeservice.enums.Region;
import com.ironhack.edgeservice.model.User;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class PlaceDTO {


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

}
