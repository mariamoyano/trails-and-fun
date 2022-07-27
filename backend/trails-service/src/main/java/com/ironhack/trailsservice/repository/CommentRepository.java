package com.ironhack.trailsservice.repository;

import com.ironhack.trailsservice.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {


    List<Comment> findByTrailId(Long trailId);

    List<Comment> findByUserId(Long userId);


   List<Comment> findByTrailIdAndUserId( Long trailId, Long userId);




}
