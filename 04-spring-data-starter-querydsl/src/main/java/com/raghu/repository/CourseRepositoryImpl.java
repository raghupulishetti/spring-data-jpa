package com.raghu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import com.querydsl.jpa.JPQLQuery;
import com.raghu.model.Course;
import com.raghu.model.QCourse;
import com.raghu.model.QUser;
import com.raghu.model.QUserCourse;

public class CourseRepositoryImpl extends QuerydslRepositorySupport implements CourseCustomRepository {
	public CourseRepositoryImpl() {
		super(Course.class);
	}

	public List<Course> findAllUserCourses(long l) {
		// TODO Auto-generated method stub
		QCourse course = QCourse.course;
		QUserCourse uc = QUserCourse.userCourse;
		QUser user = QUser.user;
		JPQLQuery query =  from(course).
				innerJoin(course.userCourses,uc).
				innerJoin(uc.user,user).
				where(user.id.eq(l));
		return query.fetch();
	}

	
}
