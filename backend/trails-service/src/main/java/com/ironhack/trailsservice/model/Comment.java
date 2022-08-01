package com.ironhack.trailsservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Comment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "traiId", referencedColumnName = "id", nullable = false)
    @JsonIgnore
    private Trail trail;

    private String text;



    public Comment(Long userId, Trail trail, String text) {
        this.userId = userId;
        this.trail = trail;
        this.text = text;
    }


}
