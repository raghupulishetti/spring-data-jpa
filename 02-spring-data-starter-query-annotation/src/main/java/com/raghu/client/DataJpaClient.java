package com.raghu.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raghu.config.ApplicationConfig;
import com.raghu.model.Course;
import com.raghu.repository.CourseRepository;

public class DataJpaClient {
	public static void main(String... args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		CourseRepository courseRepository = (CourseRepository) ctx.getBean("courseRepository");

		Course c = null;
		List<Course> courses = null;
		/*System.out.println("**************** findByName *************");
		c = courseRepository.findByName("Core Java");
		System.out.println(c);
		
		
		System.out.println("**************** findByNameOrDescription *************");
		courses = courseRepository.findByNameOrDescription("Core Java", "Spring Data");
		System.out.println(courses);
		
		System.out.println("**************** countByName *************");
		long count = courseRepository.countByName("Spring Data");
		System.out.println(count);
		
		System.out.println("**************** findDistinctByName *************");
		courses = courseRepository.findDistinctByName("Spring Data");
		System.out.println(courses);
		
		System.out.println("**************** findFirst3ByNameOrderByNameAsc *************");
		courses = courseRepository.findFirst3ByNameOrderByNameAsc("Spring Data");
		System.out.println(courses);
		
		
		System.out.println("**************** findByNameOrDescriptionContainsAllIgnoreCase *************");
		courses = courseRepository.findByNameAndDescriptionContainsAllIgnoreCase("Core Java","Core");
		System.out.println(courses);*/
		
		System.out.println("**************** findAllUserCourses *************");
		courses = courseRepository.findAllUserCourses(4L);
		System.out.println(courses);


	}
}
