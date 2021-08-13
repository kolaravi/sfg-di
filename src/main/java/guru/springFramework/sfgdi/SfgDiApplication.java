package guru.springFramework.sfgdi;

import guru.springFramework.sfgdi.controllers.ConstructorInjectedController;
import guru.springFramework.sfgdi.controllers.MyController;
import guru.springFramework.sfgdi.controllers.PropertyInjectedController;
import guru.springFramework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) applicationContext.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("-----Property Injection-----");
		PropertyInjectedController propertyInjectedController =(PropertyInjectedController) applicationContext.getBean("propertyInjectedController");

		greeting = propertyInjectedController.getGreeting();
		System.out.println(greeting);

		System.out.println("-----Setter Injection-----");
		SetterInjectedController setterInjectedController =(SetterInjectedController) applicationContext.getBean("setterInjectedController");

		greeting = setterInjectedController.getGreeting();
		System.out.println(greeting);

		System.out.println("-----Constructor Injection-----");
		ConstructorInjectedController constructorInjectedController =(ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");

		greeting = constructorInjectedController.getGreeting();
		System.out.println(greeting);
	}

}
