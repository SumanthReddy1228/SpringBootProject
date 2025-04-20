package com.sumanth.springboot.learn_jpa_hibernate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/courses")
public class CourseConfig {

    @GetMapping
    public String getCourses() {
        return "List of Courses";
    }
}
// This is a simple Spring MVC controller that handles HTTP GET requests to the "/courses" endpoint.
// The @RestController annotation indicates that this class is a controller where every method returns a domain object instead of a view.
// The @RequestMapping annotation is used to map web requests to specific handler methods.
// The @GetMapping annotation is a shortcut for @RequestMapping(method = RequestMethod.GET).
// The getCourses() method returns a simple string "List of Courses" when a GET request is made to the "/courses" endpoint.
// This is a simple example of how to create a RESTful web service using Spring Boot.
// The @RestController annotation is a convenience annotation that combines @Controller and @ResponseBody.
// It allows you to create RESTful web services in a more concise way.
