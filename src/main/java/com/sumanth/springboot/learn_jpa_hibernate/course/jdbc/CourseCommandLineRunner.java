package com.sumanth.springboot.learn_jpa_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sumanth.springboot.learn_jpa_hibernate.course.Course;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;
    
    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insertCourse(new Course(1,"Java","sumanth"));
        courseJdbcRepository.insertCourse(new Course(2,"python","sam"));
        courseJdbcRepository.insertCourse(new Course(3,"Spring","ranga"));
        courseJdbcRepository.insertCourse(new Course(4,"AWS","Reddy"));
        System.out.println("Data inserted successfully");
  
        courseJdbcRepository.deleteCourseByID(1);
        System.out.println("course deleted");
        System.out.println("get course by id");
        System.out.println(courseJdbcRepository.findCouserByID(3));
    }
    

}

