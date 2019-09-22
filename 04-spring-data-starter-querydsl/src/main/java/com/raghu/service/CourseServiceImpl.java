package com.raghu.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.Querydsl;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Service;

import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPAQuery;
import com.raghu.model.Course;
import com.raghu.model.QCourse;
import com.raghu.model.QUser;
import com.raghu.model.QUserCourse;
import com.raghu.repository.CourseRepository;
import com.raghu.repository.CourseRepositoryImpl;

@Service("courseService")
public class CourseServiceImpl extends QuerydslRepositorySupport {

	public CourseServiceImpl() {
		super(Course.class);

	}


	@Autowired
	CourseRepositoryImpl courseRepositoryImpl;
	
	@Autowired
	CourseRepository courseRepository;

	public Course findByName(String name) {
		Predicate pred = QCourse.course.name.eq(name);
		Optional<Course> course = courseRepository.findOne(pred);
		if (course.isPresent()) {
			return course.get();
		}
		return null;
	}

	public List<Course> findAllUserCourses(long l) {
		
		/*QCourse course = QCourse.course;
		QUserCourse uc = QUserCourse.userCourse;
		QUser user = QUser.user;
		JPAQuery query = new JPAQuery(em);
		List<Course> courses = query.from(course).where(course.name.eq("Spring Data")).list(course);
courseRepositoryImpl
		from(course).where(course.name.eq("Spring Data")).list(course);*/
		return courseRepositoryImpl.findAllUserCourses(l);
		//return courses;
	}

}
