package com.raghu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.raghu.model.Course;
import com.raghu.repository.CourseRepository;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepository courseRepository;

	@Transactional(readOnly=true)
	@Override
	public Course findOne(long id) {
		return courseRepository.findOne(id);
	}

	@Override
	public void save(Course course) {
		courseRepository.save(course);

	}

}
