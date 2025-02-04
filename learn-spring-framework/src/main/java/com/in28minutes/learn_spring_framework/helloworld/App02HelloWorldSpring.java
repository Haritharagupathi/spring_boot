package com.in28minutes.learn_spring_framework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacMan;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

record Person(String name,int age,Address address) {};

public class App02HelloWorldSpring {

	public static void main(String[] args) {
	
	//1.Launch a spring Context
		try(var context=new AnnotationConfigApplicationContext
				(HelloWorldConfiguration.class)){
	
	//2.Configure the things that we want Spring to manage
	System.out.println(context.getBean("name"));
	System.out.println(context.getBean("age"));
	System.out.println(context.getBean("person"));
	System.out.println(context.getBean("person2MethodCall"));
	System.out.println(context.getBean("person3Parameters"));
	System.out.println(context.getBean("address2"));
	System.out.println(context.getBean(Person.class));	
	System.out.println(context.getBean(Address.class));	
	System.out.println(context.getBean("person3Parameters"));
	//Arrays.stream(context.getBeanDefinitionNames())
//	.forEach(System.out::println);
	
	}
	}
}

