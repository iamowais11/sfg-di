package com.example.sfgdi;

import com.example.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SfgDiApplication.class, args);

		MyController controller=(MyController) context.getBean("myController");
		String greetings=controller.sayHello();
		System.out.println(greetings);

		//For Primary Service Usage
		System.out.println("------Primary Service Usage");
		System.out.println(controller.getGreetings());

		//For Profile Usage if Service have same name
		System.out.println("------Profile Usage");
		I18nController i18nController=(I18nController)context.getBean("i18nController");
		System.out.println(i18nController.sayHello());


		//Dependency Injection With Spring Framework
		System.out.println("---------- Property ");
		PropertyInjectedController propertyInjectedController=(PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreetings());



		System.out.println("---------- Setter ");
		SetterInjectedController setterInjectedController =(SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreetings());


		System.out.println("---------- Constructor ");
		 ConstructorInjectedController constructorInjectedController =(ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreetings());

	}

}
