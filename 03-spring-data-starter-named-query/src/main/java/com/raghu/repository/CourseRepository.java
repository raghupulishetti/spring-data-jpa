package com.raghu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.raghu.model.Course;

//@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

	@Query(name="Course.findByName",nativeQuery=true)
	public Course findByName(@Param("name") String name);

	
	@Query(name="Course.findAllUserCourses")
	public List<Course> findAllUserCourses(@Param("id") Long userId);
}
