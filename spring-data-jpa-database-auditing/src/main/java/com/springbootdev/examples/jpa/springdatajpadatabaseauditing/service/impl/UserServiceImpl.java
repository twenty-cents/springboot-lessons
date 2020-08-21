package com.springbootdev.examples.jpa.springdatajpadatabaseauditing.service.impl;

import com.springbootdev.examples.jpa.springdatajpadatabaseauditing.model.User;
import com.springbootdev.examples.jpa.springdatajpadatabaseauditing.repository.UserRepository;
import com.springbootdev.examples.jpa.springdatajpadatabaseauditing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }
}