package com.ironhack.edgeservice.controller.dto;



public class CommentDTO {

    private Long id;
    private String comment;
    private Long userId;
    private Long trailId;

    public CommentDTO() {
    }

    public CommentDTO(String comment, Long userId, Long trailId) {
        this.comment = comment;
        this.userId = userId;
        this.trailId = trailId;
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

    public Long getTrailId() {
        return trailId;
    }

    public void setTrailId(Long trailId) {
        this.trailId = trailId;
    }
}
