package com.raghu.client;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.model.Course;
import com.raghu.repository.CourseRepository;
import com.raghu.service.CourseService;

public class DataJpaClient {
	public static void main(String... args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CourseService courseService = (CourseService) ctx.getBean("courseService");
		Course course = new Course();
		course.setName("Spring Data");
		course.setInstructor("Raghu");
		course.setDurationInDays(60);
		course.setCourseStartDate(new Date());
		courseService.save(course);

		System.out.println("**************** Inserted Course *************");
		System.out.println(course);

		System.out.println("**************** Course With Id *************");
		Course c = courseService.findOne(1L);
		System.out.println(c);

	}
}
