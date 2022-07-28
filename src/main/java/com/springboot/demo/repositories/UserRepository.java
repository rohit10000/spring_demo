package com.springboot.demo.repositories;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.springboot.demo.models.User;

@Repository //register as a component, repository level component do something with the data layer. 
public class UserRepository {

    Map<UUID, User> users = new HashMap<>();

    public UserRepository() {}
    
    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public User getUser(UUID id) {
        return users.get(id);
    }

    public List<User> getAllUser() {
        return new ArrayList<>(users.values());
    }

    public User getUserByName(String name) {
        name = name.toLowerCase();

        for (User u: users.values()) {
            if (u.getName().equals(name))
                return u;
        }

        return null;
    }

    public User updateUser(User user) {
        User original = users.get(user.getId());
        original.setName(user.getName());
        original.setGender(user.getGender());

        return original;
    }

    public User removeUser(UUID id) {
        return users.remove(id);
    }
     
}
