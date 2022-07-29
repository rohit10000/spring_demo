package com.springboot.demo.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.models.User;
import com.springboot.demo.repositories.UserRepository;

@Service
public class DefaultUserService implements UserService{
    UserRepository userRepository;

    @Autowired
    public DefaultUserService(UserRepository userRepository) {
        this.userRepository = userRepository;

        System.out.println("DefaultUserService is called");
    }



    @Override
    public User createUser(User requestUser) {
        // validation
        // name to be lowercase
        // gender to be female
        // id to be set

        User user = new User(
            requestUser.getName(),
            requestUser.getId(),
            requestUser.getGender()
        );

        if (user.getId() == null) {
            user.setId(UUID.randomUUID());
        }

        user.setName(user.getName().toLowerCase());

        userRepository.addUser(user);

        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUser();
    }

    @Override
    public User getUser(UUID id) {
        return userRepository.getUser(id);
    }

    @Override
    public User getUserByName(String name) {
        return userRepository.getUserByName(name); 
    }


    
    
}
