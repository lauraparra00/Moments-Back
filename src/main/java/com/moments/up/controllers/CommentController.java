package com.moments.up.controllers;

import com.moments.up.dtos.CommentRequestDto;
import com.moments.up.models.Comment;
import com.moments.up.models.User;
import com.moments.up.services.IClimberService;
import com.moments.up.services.ICommentService;
import com.moments.up.services.IUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class CommentController {

    //Atributs
    private ICommentService commentService;
    private IClimberService climberService;
    private IUserService userService;

    //Constructor
    public CommentController(ICommentService commentService, IClimberService climberService, IUserService userService) {
        this.commentService = commentService;
        this.climberService = climberService;
        this.userService = userService;
    }

    //Get all comments
    @GetMapping("/comments")
    List<Comment> getAll() {
        return this.commentService.findAll();
    }
    // GET comments by id
    @GetMapping("/comments/{id}")
    Comment getById(@PathVariable Long id) {
        return this.commentService.getById(id);
    }
    // GET comments by moment id
    @GetMapping("/moments/{id}/comments")
    List<Comment> getMomentComments(@PathVariable Long id) {
        return commentService.findAllByClimberId(id);
    }


    //commentDto és el que ens arriba de la app
    @PostMapping("/comments")
    Comment createComment(@RequestBody CommentRequestDto commentDto) {
        User authUser = getAuthUser(commentDto.getUserId());
        return commentService.createComment(commentDto, authUser);
    }

    private User getAuthUser(Long id) {
        return userService.getById(id);
    }

}
