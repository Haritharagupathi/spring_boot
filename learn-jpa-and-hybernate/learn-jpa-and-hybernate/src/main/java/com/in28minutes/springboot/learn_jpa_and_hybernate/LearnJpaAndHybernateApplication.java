package com.in28minutes.springboot.learn_jpa_and_hybernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.springboot.learn_jpa_and_hybernate.course.jdbc.CourseJdbcRepository;

@SpringBootApplication
public class LearnJpaAndHybernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnJpaAndHybernateApplication.class, args);
	}
	
}
