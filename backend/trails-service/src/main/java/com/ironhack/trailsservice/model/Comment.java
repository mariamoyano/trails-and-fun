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
    @JsonIgnore
    private Trail trail;

    private String text;



    public Comment(Long userId, String text) {
        this.userId = userId;
        this.text = text;
    }


}
