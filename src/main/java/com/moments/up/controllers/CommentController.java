package com.moments.up.controllers;

import com.moments.up.dtos.CommentRequestDto;
import com.moments.up.models.Comment;
import com.moments.up.repositories.IClimberRepository;
import com.moments.up.repositories.ICommentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {
    private ICommentRepository commentRepository;
    private IClimberRepository climberRepository;

    public CommentController(ICommentRepository commentRepository, IClimberRepository climberRepository) {
        this.commentRepository = commentRepository;
        this.climberRepository = climberRepository;
    }

    @GetMapping("/comments")
    List<Comment> getAll() {
        return this.commentRepository.findAll();
    }

    //commentDto és el que ens arriba de la app
    @PostMapping("/comments")
    Comment create(@RequestBody CommentRequestDto commentDto) {
        var newComment = new Comment();
        newComment.setComment(commentDto.getComment());
        var climber = this.climberRepository.findById(commentDto.getClimberId()).get();
        newComment.setClimber(climber);
        return this.commentRepository.save(newComment);
    }
}
