package com.moments.up.services;

import com.moments.up.dtos.CommentRequestDto;
import com.moments.up.models.Comment;
import com.moments.up.models.User;

import java.util.List;

public interface ICommentService {
    List<Comment> findAll();

    Comment getById(Long id);

    Comment save(Comment newComment);

    List<Comment> findAllByClimberId(Long id);

    Comment createComment(CommentRequestDto commentDto, User authUser);

    //Creem un comentari per fer servir el Postman
}
