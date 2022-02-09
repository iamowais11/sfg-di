package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    //Manually Creating Instances
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        //manually creating instance
        controller=new PropertyInjectedController();
        //assigning greeting service ref to instance of greeting ser impl
        //using property of class here or field directly
        controller.greetingServices=new GreetingServicesImpl();
    }

    //Run Tests separately
    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}