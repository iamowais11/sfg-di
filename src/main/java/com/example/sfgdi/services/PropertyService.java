package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyService implements GreetingServices {
    @Override
    public String sayGreetings() {
        return "Hello Property Injected Service";
    }
}
