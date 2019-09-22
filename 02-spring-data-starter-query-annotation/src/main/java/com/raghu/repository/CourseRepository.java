package com.raghu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.raghu.model.Course;

//@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

	public Course findByName(String id);

	public List<Course> findByNameOrDescription(String name, String description);

	public long countByName(String name);

	public List<Course> findDistinctByName(String name);

	public List<Course> findFirst3ByNameOrderByNameAsc(String title);

	public List<Course> findByNameAndDescriptionContainsAllIgnoreCase(String name, String description);
	
/*	@Query(value = "select distinct c from Course c join c.userCourses uc join uc.user u where u.id=?1")
	public List<Course> findAllUserCourses(Long userId);*/
	
	@Query(value = "select distinct c from Course c join c.userCourses uc join uc.user u where u.id=:id")
	public List<Course> findAllUserCourses(@Param("id") Long userId);
}
