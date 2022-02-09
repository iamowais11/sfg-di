package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        //Using constructor to initialize ref of greeting serv interface by greeting serv class
        controller=new ConstructorInjectedController(new GreetingServicesImpl());
    }


    //Run Tests separately
    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}