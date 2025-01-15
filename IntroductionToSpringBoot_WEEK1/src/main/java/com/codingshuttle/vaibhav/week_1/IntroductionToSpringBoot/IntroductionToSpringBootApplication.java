package com.codingshuttle.vaibhav.week_1.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {

	@Autowired
	Student studentObject1;

	@Autowired
	Student studentObject2;

	@Autowired
	ApplicationDBService applicationDBService;
	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);

		Apple appleObject = new Apple();
		appleObject.eatApple();
/*		 Previously we create and manage object like This using New Keyword
       Inside heap our object is created
		 Control: The developer explicitly controls object creation.
		 No dependency management. No lifecycle Management .
*/
	}

	@Override
	public void run(String... args) throws Exception {
		/* This creates a non-Static Context
			we use to run our Bean here
		*/
		studentObject1.sayHello();
		studentObject2.sayHello();
		String dbDATA=applicationDBService.useDatabase();
		System.out.println(dbDATA);
	}
}
