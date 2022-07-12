package com.springdatajpa.springdatajpa.repository;

import com.springdatajpa.springdatajpa.entity.Course;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class CourseRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Optional<Course> findByID(long id){
        Course course=entityManager.find(Course.class,id);
        return course!= null ? Optional.of(course):Optional.empty();
    }

    public List<Course> findAll(){

        return entityManager.createNamedQuery("find_all_course",Course.class).getResultList();
    }

    public void deleteByID(long id){
        if(findByID(id).isPresent()) {
            entityManager.remove(findByID(id).get());
        }
    }
}
