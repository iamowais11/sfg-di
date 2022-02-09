package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingServices;

public class ConstructorInjectedController {

  public final  GreetingServices greetingServices;

    public ConstructorInjectedController(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreetings(){

        return greetingServices.sayGreetings();
    }
}
