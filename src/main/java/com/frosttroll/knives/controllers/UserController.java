package com.frosttroll.knives.controllers;

import com.frosttroll.knives.entity.User;
import com.frosttroll.knives.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<User> getAllUsers() {
        return userService.getUsers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") Integer id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value ="/login/{id}", method = RequestMethod.GET)
    public User login(@PathVariable("id") Integer id) {
        return userService.getUserById(id);
    }

}
