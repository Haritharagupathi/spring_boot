package com.in28minutes.springboot.learn_spring_boot;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course>retriveCourses(){
		return Arrays.asList(
				new Course(1,"learn AWS","ijuvjv"),
				new Course(1,"learn Devops","in28minutes")
				);
		
	}

}
