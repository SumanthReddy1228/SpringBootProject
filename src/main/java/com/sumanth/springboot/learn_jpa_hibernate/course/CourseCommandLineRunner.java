package com.sumanth.springboot.learn_jpa_hibernate.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sumanth.springboot.learn_jpa_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//    @Autowired
//    private CourseJdbcRepository courseJdbcRepository;

//	@Autowired
//    private repository repository;

	@Autowired
	private CourseSpringDataJpaRepository repository;
	
    @Override
    public void run(String... args) throws Exception {
    	repository.save(new Course(1,"Java","sumanth"));
    	repository.save(new Course(2,"python","sam"));
    	repository.save(new Course(3,"Spring JPA","ranga"));
        repository.save(new Course(4,"AWS","Reddy"));
        System.out.println("Data inserted successfully");
  
        repository.deleteById(1l);
        System.out.println("course deleted");
        System.out.println("get course by id");
        System.out.println(repository.findById(3l));
        System.out.println("All courses");
        List<Course> courses=repository.findAll();
        for(Course course:courses) {
        	System.out.println(course);
        }
        
        System.out.println();
        System.out.println("Find By Author");
        System.out.println(repository.findByAuthor("sam"));
        System.out.println();
        System.out.println("Find By course Name");
        System.out.println(repository.findByName("AWS"));
    }
    

}

