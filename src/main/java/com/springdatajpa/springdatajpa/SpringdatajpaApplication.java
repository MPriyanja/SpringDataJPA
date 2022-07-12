package com.springdatajpa.springdatajpa;

import com.springdatajpa.springdatajpa.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringdatajpaApplication implements CommandLineRunner {

	@Autowired
	CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		courseRepository.findAll().forEach(System.out::println);
//		System.out.println(courseRepository.findByID(1L));
//		courseRepository.deleteByID(1L);
//		courseRepository.findAll().forEach(System.out::println);
//		courseRepository.deleteByID(1L);

	}
}
