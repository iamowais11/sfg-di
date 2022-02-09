package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingServices;

public class PropertyInjectedController {

    public GreetingServices greetingServices;

    public String getGreetings(){

        return greetingServices.sayGreetings();
    }
}
