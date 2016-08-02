package com.tutorialspoint.bean_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/tutorialspoint/bean_scope/Beans.xml");

		System.out.println("Singleton:");
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		objA.setMessage("I'm object A");
		objA.getMessage();
		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
		objB.getMessage();
		
		System.out.println();
		System.out.println("Prototype:");
		HelloWorld obj2A = (HelloWorld) context.getBean("helloWorld2");
		obj2A.setMessage("I'm object A");
		obj2A.getMessage();
		HelloWorld obj2B = (HelloWorld) context.getBean("helloWorld2");
		obj2B.getMessage();
	}
}