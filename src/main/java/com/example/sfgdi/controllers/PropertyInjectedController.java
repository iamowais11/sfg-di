package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServices greetingServices;

    public String getGreetings(){

        return greetingServices.sayGreetings(this);
    }
}
