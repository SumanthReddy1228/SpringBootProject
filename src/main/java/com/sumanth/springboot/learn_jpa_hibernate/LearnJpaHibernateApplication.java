package com.sumanth.springboot.learn_jpa_hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnJpaHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnJpaHibernateApplication.class, args);
	}

}
// This is the main class of the Spring Boot application. It contains the main method which is the entry point of the application.
// The @SpringBootApplication annotation is a convenience annotation that adds:
// 1. @Configuration: Indicates that the class can be used by the Spring IoC container as a source of bean definitions.
// 2. @EnableAutoConfiguration: Enables Spring Boot’s auto-configuration mechanism.
// 3. @ComponentScan: Enables component scanning so that the application can find and register beans in the specified package.
	