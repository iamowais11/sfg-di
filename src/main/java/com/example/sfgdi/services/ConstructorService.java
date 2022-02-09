package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorService implements GreetingServices{

    @Override
    public String sayGreetings() {
        return "Hello Constructor Injected Service";
    }
}
