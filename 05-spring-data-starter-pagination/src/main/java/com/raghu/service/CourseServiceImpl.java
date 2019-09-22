package com.raghu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.raghu.model.Course;
import com.raghu.repository.CourseRepository;

@Service("courseService")
public class CourseServiceImpl {
	
	@Autowired
	CourseRepository courseRepository;

	public List<Course> findByName(String name){
		
		Pageable pageRequest = createPageRequest();
		return courseRepository.findByName(name, pageRequest);
		
	}
	
	private Pageable createPageRequest() {
        //Create a new Pageable object here.
		 //return new PageRequest(1, 2, Sort.Direction.ASC, "name", "description");
		 
		 return new PageRequest(1, 
		            10, 
		            new Sort(Sort.Direction.DESC, "description")
		                    .and(new Sort(Sort.Direction.ASC, "name"))
		    );
		 
    }
 }
