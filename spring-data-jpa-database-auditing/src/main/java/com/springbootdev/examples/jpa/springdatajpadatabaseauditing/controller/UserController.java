package com.springbootdev.examples.jpa.springdatajpadatabaseauditing.controller;

import com.springbootdev.examples.jpa.springdatajpadatabaseauditing.model.User;
import com.springbootdev.examples.jpa.springdatajpadatabaseauditing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.create(user);
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user) {
        return userService.create(user);
    }
}