package com.ironhack.edgeservice.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ironhack.edgeservice.enums.Difficulty;
import com.ironhack.edgeservice.enums.Region;
import lombok.Data;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;

@Data
public class TrailDTO {

    private Long  id;
    private Long  userId;
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
    @JsonIgnore
    private List<CommentDTO> comment;


}
