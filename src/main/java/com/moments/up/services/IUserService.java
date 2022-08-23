package com.moments.up.services;

import com.moments.up.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {


    List<User> getAll();

    User getById(Long id);

}
