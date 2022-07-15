package com.moments.up.services;

import com.moments.up.models.User;
import com.moments.up.repositories.IUserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    private IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }
}
