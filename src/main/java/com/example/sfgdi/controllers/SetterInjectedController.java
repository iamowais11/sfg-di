package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    public GreetingServices greetingServices;

    @Qualifier("setterService")
    @Autowired
    public void setGreetingServices(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreetings(){

        return greetingServices.sayGreetings();
    }
}
