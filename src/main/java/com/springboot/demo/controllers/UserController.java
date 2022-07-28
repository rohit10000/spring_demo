package com.springboot.demo.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.models.User;
//import com.springboot.demo.services.DefaultUserService;
import com.springboot.demo.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    
    UserService userService;

    @Autowired// telling spring that make this dependency available prior to the creation of UserController class
    public UserController(UserService userService) {
        this.userService = userService;
        // this is dependency injection.
        // in this way we injection dependency.
    }


    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        // models -> persistence, business logic
        // services -> business logic, external APIs.

        return userService.createUser(user);

    }

    @GetMapping("")
    public List<User> helloWorld() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable(name="id") UUID id) {
        return userService.getUser(id);
    }
}
