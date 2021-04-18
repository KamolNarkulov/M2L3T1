package com.example.demo.repository;

import com.example.demo.entity.Comment;
import com.example.demo.projection.CustomComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "comment", collectionResourceRel = "commentList", excerptProjection = CustomComment.class)
public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
