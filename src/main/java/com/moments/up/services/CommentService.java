package com.moments.up.services;


import com.moments.up.dtos.CommentRequestDto;
import com.moments.up.models.Comment;
import com.moments.up.models.User;
import com.moments.up.repositories.IClimberRepository;
import com.moments.up.repositories.ICommentRepository;
import com.moments.up.repositories.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService implements ICommentService {

    private ICommentRepository commentRepository;
    private IClimberRepository climberRepository;

    private IUserRepository userRepository;

    //Constructor
    public CommentService(ICommentRepository commentRepository, IClimberRepository climberRepository,IUserRepository userRepository) {
        this.commentRepository = commentRepository;
        this.climberRepository = climberRepository;
        this.userRepository = userRepository;
    }
    @Override
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }
    @Override
    public Comment getById(Long id) {
        return commentRepository.findById(id).get();
    }
    @Override
    public Comment save(Comment newComment){
        return commentRepository.save(newComment);
    }
    @Override
    public List<Comment> findAllByClimberId(Long id) {
        return commentRepository.findByClimberId(id);
    }
    @Override
    public Comment createComment(CommentRequestDto commentDto, User authUser) {
        var newComment = new Comment();
        newComment.setComment(commentDto.getComment());
        var climber = this.climberRepository.findById(commentDto.getClimberId()).get();
        newComment.setClimber(climber);
        var user = new User();
        newComment.setPhotographer(authUser);
        return commentRepository.save(newComment);
    }
}

