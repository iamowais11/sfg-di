package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller=new SetterInjectedController();

        //Using Setter method of class to initialize ref of greetings services by greeting serv impl class
        controller.setGreetingServices(new GreetingServicesImpl());
    }

    //Run Tests separately
    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}