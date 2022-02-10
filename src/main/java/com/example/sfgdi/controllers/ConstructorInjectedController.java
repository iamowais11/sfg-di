package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

  private final  GreetingServices greetingServices;

    @Autowired
    public ConstructorInjectedController(@Qualifier("constructorService") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreetings(){

        return greetingServices.sayGreetings();
    }
}
