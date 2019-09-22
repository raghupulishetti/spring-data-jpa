package com.raghu.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import com.raghu.model.User;

//@Repository
public interface UserRepository extends CrudRepository<User, Long>,QuerydslPredicateExecutor<User> {

	//public List<Courses>
}
