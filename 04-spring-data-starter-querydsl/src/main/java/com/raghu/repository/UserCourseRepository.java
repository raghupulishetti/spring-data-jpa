package com.raghu.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import com.raghu.model.UserCourse;

//@Repository
public interface UserCourseRepository extends CrudRepository<UserCourse, Long>,QuerydslPredicateExecutor<UserCourse> {

}
