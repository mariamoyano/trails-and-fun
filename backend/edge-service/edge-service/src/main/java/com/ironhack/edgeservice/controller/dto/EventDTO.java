package com.ironhack.edgeservice.controller.dto;



import com.ironhack.edgeservice.enums.Region;
import com.ironhack.edgeservice.enums.Type;
import lombok.Data;

import javax.persistence.*;




@Data
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


}
