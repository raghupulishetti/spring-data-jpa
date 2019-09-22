package com.raghu.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserCourse is a Querydsl query type for UserCourse
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserCourse extends EntityPathBase<UserCourse> {

    private static final long serialVersionUID = 2069580417L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserCourse userCourse = new QUserCourse("userCourse");

    public final QCourse course;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QUser user;

    public QUserCourse(String variable) {
        this(UserCourse.class, forVariable(variable), INITS);
    }

    public QUserCourse(Path<? extends UserCourse> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUserCourse(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUserCourse(PathMetadata metadata, PathInits inits) {
        this(UserCourse.class, metadata, inits);
    }

    public QUserCourse(Class<? extends UserCourse> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.course = inits.isInitialized("course") ? new QCourse(forProperty("course")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

