package com.moments.up.services;

import com.moments.up.models.User;

import java.util.List;

public interface IUserService {
    User getById(Long id);
    List<User> getAll();
}
