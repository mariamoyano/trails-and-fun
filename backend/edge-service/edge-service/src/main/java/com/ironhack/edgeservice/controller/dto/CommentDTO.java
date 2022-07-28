package com.ironhack.edgeservice.controller.dto;


import com.ironhack.edgeservice.enums.Section;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
@Data
public class CommentDTO {

    private Long id;
    private String comment;
    private Long userId;
    private Long itemId;
    @Enumerated(EnumType.STRING)
    private Section section;

}
