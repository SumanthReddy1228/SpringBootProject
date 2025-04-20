package com.sumanth.springboot.learn_jpa_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    private static String INSERT_QUERY= "insert into course (id, name, author) values (1,'JAVA Course' ,'sumanth')";

    public void insertCourse(){
        jdbcTemplate.execute(INSERT_QUERY);
    }
    

}
