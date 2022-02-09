package com.example.sfgdi;

import com.example.sfgdi.controllers.ConstructorInjectedController;
import com.example.sfgdi.controllers.MyController;
import com.example.sfgdi.controllers.PropertyInjectedController;
import com.example.sfgdi.controllers.SetterInjectedController;
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
