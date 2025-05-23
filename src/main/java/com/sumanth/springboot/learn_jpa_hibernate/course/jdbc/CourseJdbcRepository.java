package com.sumanth.springboot.learn_jpa_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sumanth.springboot.learn_jpa_hibernate.course.Course;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static String INSERT_QUERY = "insert into course (id, name, author) values (?,? ,?)";
	private static String DELETE_QUERY = "Delete from Course where id=?";
	private static String SELECT_QUERY = "select * from Course where id=?";

	public void insertCourse(Course course) {
		jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

	public void deleteCourseByID(long id) {
		jdbcTemplate.update(DELETE_QUERY, id);
	}

	public Course findCouserByID(long id) {

		return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
	}
}
