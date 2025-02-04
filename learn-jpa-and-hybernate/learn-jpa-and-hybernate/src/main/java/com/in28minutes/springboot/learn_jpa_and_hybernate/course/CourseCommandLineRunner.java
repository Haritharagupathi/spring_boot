package com.in28minutes.springboot.learn_jpa_and_hybernate.course;

import org.apache.catalina.startup.ClassLoaderFactory.RepositoryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learn_jpa_and_hybernate.course.Course;
import com.in28minutes.springboot.learn_jpa_and_hybernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learn_jpa_and_hybernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learn_jpa_and_hybernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	//@Autowired
 //private CourseJpaRepository repository ;
  
	
@Autowired
private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1,"Learn aws jpa","in28min"));
		repository.save(new Course(2,"Learn azure jpa","in28min"));
		repository.save(new Course(3,"Learn devops jpa","in28min"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByName("Learn devops Jpa"));
		System.out.println(repository.findByAuthor("in28min"));
	    
			
	}

	
	
}