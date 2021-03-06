package com.installsync.platform.service;

import com.installsync.platform.repository.UserRepository;
import com.installsync.platform.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public boolean existUserByEmail(String email) {
        return userRepository.existsUsersByEmail(email);
    }
}