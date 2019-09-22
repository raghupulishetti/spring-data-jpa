package com.raghu.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raghu.config.ApplicationConfig;
import com.raghu.model.Course;
import com.raghu.service.CourseServiceImpl;

public class DataJpaClient {
	public static void main(String... args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		CourseServiceImpl courseService = (CourseServiceImpl) ctx.getBean("courseService");

		Course c = null;
		List<Course> courses = null;
		System.out.println("**************** findByName *************");
		courses = courseService.findByName("Spring Data");
		System.out.println(courses);

	}
}
