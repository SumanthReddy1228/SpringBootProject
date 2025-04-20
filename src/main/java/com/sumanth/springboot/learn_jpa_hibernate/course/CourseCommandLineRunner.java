package com.sumanth.springboot.learn_jpa_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sumanth.springboot.learn_jpa_hibernate.course.Course;
import com.sumanth.springboot.learn_jpa_hibernate.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//    @Autowired
//    private CourseJdbcRepository courseJdbcRepository;

	@Autowired
    private CourseJpaRepository courseJpaRepository;
    
    @Override
    public void run(String... args) throws Exception {
    	courseJpaRepository.insertCourse(new Course(1,"Java","sumanth"));
    	courseJpaRepository.insertCourse(new Course(2,"python","sam"));
    	courseJpaRepository.insertCourse(new Course(3,"Spring JPA","ranga"));
        courseJpaRepository.insertCourse(new Course(4,"AWS","Reddy"));
        System.out.println("Data inserted successfully");
  
        courseJpaRepository.deleteCourseById(1);
        System.out.println("course deleted");
        System.out.println("get course by id");
        System.out.println(courseJpaRepository.findCourseById(3));
    }
    

}

