package com.raghu.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCourse is a Querydsl query type for Course
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCourse extends EntityPathBase<Course> {

    private static final long serialVersionUID = 287394902L;

    public static final QCourse course = new QCourse("course");

    public final DatePath<java.util.Date> courseStartDate = createDate("courseStartDate", java.util.Date.class);

    public final DatePath<java.util.Date> deleteDate = createDate("deleteDate", java.util.Date.class);

    public final StringPath description = createString("description");

    public final NumberPath<Integer> durationInDays = createNumber("durationInDays", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath instructor = createString("instructor");

    public final StringPath name = createString("name");

    public final ListPath<UserCourse, QUserCourse> userCourses = this.<UserCourse, QUserCourse>createList("userCourses", UserCourse.class, QUserCourse.class, PathInits.DIRECT2);

    public QCourse(String variable) {
        super(Course.class, forVariable(variable));
    }

    public QCourse(Path<? extends Course> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCourse(PathMetadata metadata) {
        super(Course.class, metadata);
    }

}

