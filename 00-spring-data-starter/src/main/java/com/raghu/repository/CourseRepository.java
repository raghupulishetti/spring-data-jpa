package com.raghu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.raghu.model.Course;

//@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

}
