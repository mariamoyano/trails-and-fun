package com.ironhack.commentservice.controller.dto;


import com.ironhack.commentservice.controller.enums.Section;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class CommentDTO {

    private Long id;
    private String comment;
    private Long userId;
    private Long itemId;
    @Enumerated(EnumType.STRING)
    private Section section;
    public CommentDTO() {
    }

    public CommentDTO(String comment, Long userId, Long itemId, Section section) {
        this.comment = comment;
        this.userId = userId;
        this.itemId = itemId;
        this.section = section;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
}
