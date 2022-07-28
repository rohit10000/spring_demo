package com.springboot.demo.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.springboot.demo.models.User;


//@Component
// this is a class that will be managed by Spring
// please scan the classes

// @Service - @component - handle business logic

@Service
public interface UserService {
    public User createUser(User user);
    public List<User> getAllUsers();
    public User getUser(UUID id);
    public User getUserByName(String name);
    
}


//UserService - Scaler students -> fundamenental features
// IIITHUserService

// never progreme to implementations
// always programme to interfaces