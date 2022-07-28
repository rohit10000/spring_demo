package com.springboot.demo.models;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {
    
    private String name;
    private UUID id;
    private Gender gender;
    
    public User() {}

    public User(String name, UUID id, Gender gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    

}
