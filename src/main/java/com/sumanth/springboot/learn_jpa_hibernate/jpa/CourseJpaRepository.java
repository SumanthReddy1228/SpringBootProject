package com.sumanth.springboot.learn_jpa_hibernate.jpa;

import org.springframework.stereotype.Repository;

import com.sumanth.springboot.learn_jpa_hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional 
public class CourseJpaRepository {

//	@Autowired
	@PersistenceContext // more specific than autowire
	EntityManager entityManager;
	
	public void insertCourse(Course course) {
		entityManager.merge(course);
	}
	
	public Course findCourseById(long id) {
		return entityManager.find(Course.class, id);
	}
	
	public void deleteCourseById(long id) {
		Course course=entityManager.find(Course.class, id);
		entityManager.remove(course);
	}

}
