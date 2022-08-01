package com.ironhack.edgeservice.controller.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ironhack.edgeservice.enums.Section;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
@Data
public class CommentDTO {


    private Long id;
    private Long userId;
    @JsonIgnore
    private TrailDTO trail;

    private String text;


}
