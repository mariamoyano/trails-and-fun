package com.ironhack.trailsservice.controller.dto;



import com.ironhack.trailsservice.model.Trail;
import lombok.*;

import javax.persistence.*;

@Data
public class CommentDTO {


    private Long id;
    private Long userId;

    private Trail trail;

    private String text;


}
