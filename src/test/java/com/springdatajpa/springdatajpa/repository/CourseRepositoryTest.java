package com.springdatajpa.springdatajpa.repository;

import com.springdatajpa.springdatajpa.entity.Course;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CourseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(CourseRepositoryTest.class);

    @Autowired
    CourseRepository courseRepository;

    @Test
    @Order(1)
    public void given_courseID_then_getCourseName(){
        logger.info("given_courseID_then_getCourseName");
        Optional<Course> actualCourse= courseRepository.findByID(1);
        String actual =  (actualCourse.isPresent())? actualCourse.get().getName():"";
        assertEquals("Test",actual);
    }

    @Test
    @Order(2)
    public void should_return_null_when_deleteByID(){
        logger.info("should_return_null_when_deleteByID");
        courseRepository.deleteByID(1);
        Optional<Course> actualCourse= courseRepository.findByID(1);
//        String expected = null;
//        String actual =  (actualCourse.isPresent())? actualCourse.get().getName():null;
        assertEquals(Optional.empty(),actualCourse);
    }
}