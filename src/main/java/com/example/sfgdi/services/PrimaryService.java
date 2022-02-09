package com.example.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary    //This will be used if no qualifier is provided for a service
@Service
public class PrimaryService implements GreetingServices{
    @Override
    public String sayGreetings() {
        return "Hello From Primary Service";
    }
}
