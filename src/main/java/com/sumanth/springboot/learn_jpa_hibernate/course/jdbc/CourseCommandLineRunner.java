package com.sumanth.springboot.learn_jpa_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;
    
    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insertCourse();
        System.out.println("Data inserted successfully");
    }
    

}
