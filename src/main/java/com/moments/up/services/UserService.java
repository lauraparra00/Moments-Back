package com.moments.up.services;

import com.moments.up.models.User;
import com.moments.up.repositories.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class UserService implements IUserService{
    private IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).get();
    }

}
