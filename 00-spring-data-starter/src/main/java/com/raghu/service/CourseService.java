package com.raghu.service;

import com.raghu.model.Course;

public interface CourseService {

	Course findOne(long l);

	void save(Course course);

}
