package com.ironhack.commentservice.repository;


import com.ironhack.commentservice.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    
    

    
        List<Comment> findByUserId(Long userId);
    
    
       List<Comment> findByItemIdAndUserId( Long itemId, Long userId);


    List<Comment> findByItemId(Long itemId);
}
