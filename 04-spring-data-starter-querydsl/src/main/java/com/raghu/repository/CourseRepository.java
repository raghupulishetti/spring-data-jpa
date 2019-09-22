package com.raghu.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import com.raghu.model.Course;

//@Repository
public interface CourseRepository extends CrudRepository<Course, Long>,QuerydslPredicateExecutor<Course>,CourseCustomRepository {

	
}
