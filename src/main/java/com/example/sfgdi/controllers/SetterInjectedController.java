package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingServices;

public class SetterInjectedController {
    public GreetingServices greetingServices;

    public void setGreetingServices(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreetings(){

        return greetingServices.sayGreetings();
    }
}
