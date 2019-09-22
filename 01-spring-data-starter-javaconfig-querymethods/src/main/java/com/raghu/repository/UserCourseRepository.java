package com.raghu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.raghu.model.UserCourse;

//@Repository
public interface UserCourseRepository extends CrudRepository<UserCourse, Long> {

}
