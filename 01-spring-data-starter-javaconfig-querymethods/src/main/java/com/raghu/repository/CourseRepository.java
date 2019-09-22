package com.raghu.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.raghu.model.Course;

//@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

	public Course findByName(String id);

	public List<Course> findByNameOrDescription(String name, String description);

	public long countByName(String name);

	public List<Course> findNameDistinctByDescription(String name);

	public List<Course> findFirst3ByNameOrderByNameAsc(String title);

	public List<Course> findByNameAndDescriptionContainsAllIgnoreCase(String name, String description);
	
	
	
}
