package com.raghu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.raghu.model.User;

//@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
