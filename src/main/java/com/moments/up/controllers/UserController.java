package com.moments.up.controllers;




import com.moments.up.models.User;
import com.moments.up.services.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    //Atributs
    private IUserService userService;

    //Constructor
    public UserController(IUserService userService) {
        this.userService = userService;
    }


    @GetMapping("/users")
    List<User>getAllUsers(){
        return userService.getAll();
    }

    @GetMapping("/users/{id}")
    User getById(@PathVariable Long id){
        return userService.getById(id);
    }
}

