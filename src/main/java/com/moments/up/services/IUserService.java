package com.moments.up.services;

import com.moments.up.models.User;

public interface IUserService {
    User findById(Long id);
}
