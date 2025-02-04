package com.in28minutes.learn_spring_framework.helloworld;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age,Address address) {};
record Address(String firstLine,String city) {};

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Haritha";
	}
	@Bean
	public int age() {
		return 15;
	}
	@Bean
	public Person person() {
		return new Person("Ravi",20,new Address("Main street", "London"));
	}
	@Bean
	@Primary
	public Person person2MethodCall() {
		return new Person(name(),age(),address2());
	}
	
	
	@Bean
	public Person person3Parameters(String name,int age,Address address3) {
		return new Person(name, age, address3);
	}
	
	@Bean
	public Person person5Qualifier(String name,int age,@Qualifier("address3qualifier")Address address) {
		return new Person(name, age, address);
	}
	
	@Bean(name="address2")
	@Primary
	public Address address2() {
		return new Address("Baker Street","London");
	}
	@Bean(name="address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("Motinagar","Hyderabad");
	}

}
