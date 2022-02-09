package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterService implements GreetingServices{
    @Override
    public String sayGreetings() {
        return "Hello Setter Injected Service";
    }
}
