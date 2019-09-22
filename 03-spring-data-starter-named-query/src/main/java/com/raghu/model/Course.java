package com.raghu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
/*@NamedQueries({
		@NamedQuery(name = "Course.findAllUserCourses", 
				query = "select distinct c from Course c join c.userCourses uc "
						+ "join uc.user u where u.id=:id"),

})
@NamedNativeQueries({ 
	@NamedNativeQuery(name = "Course.findByName", 
			query = "select c.* from course c where c.name=:name",
			resultClass=Course.class)

})*/

@Table(name = "course")
public class Course {
	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "instructor")
	private String instructor;

	@Column(name = "course_start_date")
	@Temporal(TemporalType.DATE)
	private Date courseStartDate;

	@Column(name = "durationInDays")
	private Integer durationInDays;

	@Column(name = "delete_date")
	@Temporal(TemporalType.DATE)
	private Date deleteDate;

	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	List<UserCourse> userCourses = new ArrayList<>();;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public Date getCourseStartDate() {
		return courseStartDate;
	}

	public void setCourseStartDate(Date courseStartDate) {
		this.courseStartDate = courseStartDate;
	}

	public Integer getDurationInDays() {
		return durationInDays;
	}

	public void setDurationInDays(Integer durationInDays) {
		this.durationInDays = durationInDays;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	public List<UserCourse> getUserCourses() {
		return userCourses;
	}

	public void setUserCourses(List<UserCourse> userCourses) {
		this.userCourses = userCourses;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}

}
