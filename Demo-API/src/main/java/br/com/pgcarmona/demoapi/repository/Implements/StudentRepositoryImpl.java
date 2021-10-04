package br.com.pgcarmona.demoapi.repository.Implements;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.pgcarmona.demoapi.model.Student;
import br.com.pgcarmona.demoapi.model.joins.TeacherStudent;

@Repository
public class StudentRepositoryImpl{
    
    @Autowired
    EntityManager entityManager;

    public List<Student> findByTeacher(Long teacherId){
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> query = builder.createQuery(Student.class);
        Root<Student> root = query.from(Student.class);
        Join<Student, TeacherStudent> join = root.join("teachers");
        List<Predicate> predicates = new ArrayList<>();

        predicates.add(builder.equal(join.get("teacher"), teacherId));

        query.select(root).where(predicates.toArray(new Predicate[predicates.size()]));

        return entityManager.createQuery(query).getResultList();
    }

}
 