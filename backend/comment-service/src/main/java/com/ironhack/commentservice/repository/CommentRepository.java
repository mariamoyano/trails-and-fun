package com.ironhack.commentservice.repository;

import com.ironhack.commentservice.model.TrailComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<TrailComment, Long> {

    TrailComment findByEventId(Long itemId);


}
