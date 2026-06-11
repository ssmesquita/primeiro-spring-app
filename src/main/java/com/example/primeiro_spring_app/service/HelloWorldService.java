package com.example.primeiro_spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String helloWorld(String name) {

        return "Alô, MUNDO " + name;
    }
}
