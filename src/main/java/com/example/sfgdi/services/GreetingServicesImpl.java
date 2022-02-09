package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicesImpl implements GreetingServices {
    @Override
    public String sayGreetings(Object o) {
        return "Hello "+o.getClass().getName();
    }
}
