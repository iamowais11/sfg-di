package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    //For Primary Service Usage
    public final GreetingServices greetingServices;

    //if no qualifier is provided primary service will be used.
    @Autowired
    public MyController(/*@Qualifier("primaryService")*/ GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreetings(){
        return greetingServices.sayGreetings();
    }

    //For Simple Usage
    public String sayHello(){
        System.out.println("Hello World");
        return "Hi Folks";
    }
}
