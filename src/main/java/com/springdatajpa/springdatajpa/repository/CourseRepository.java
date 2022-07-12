package com.springdatajpa.springdatajpa.repository;

import com.springdatajpa.springdatajpa.entity.Course;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CourseRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Course findByID(long id){
        return entityManager.find(Course.class,id);
    }

}
