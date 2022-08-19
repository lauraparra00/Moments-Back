package com.moments.up.services;

import com.moments.up.models.User;

import java.util.List;

public interface IUserService {
    User findById(Long id);

    List<User> getAll();

    User getById(Long id);
}
