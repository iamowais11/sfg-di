package com.example.sfgdi.services;

import org.springframework.stereotype.Service;


//Common Service For All Without using qualifier
@Service
public class GreetingServicesImpl implements GreetingServices {
    @Override
    public String sayGreetings() {
        return "Hello ";
    }
}
