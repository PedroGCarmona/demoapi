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

import br.com.pgcarmona.demoapi.model.Teacher;
import br.com.pgcarmona.demoapi.model.joins.TeacherSubject;

@Repository
public class TeacherRepositoryImpl {
    
    @Autowired
    EntityManager entityManager;
    
    public List<Teacher> findBySubject(Long subjectId){
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Teacher> query = builder.createQuery(Teacher.class);
        Root<Teacher> root = query.from(Teacher.class);
        Join<Teacher, TeacherSubject> join = root.join("subjects");
        List<Predicate> predicates = new ArrayList<>();

        predicates.add(builder.equal(join.get("subject"), subjectId));

        query.select(root).where(predicates.toArray(new Predicate[predicates.size()]));

        return entityManager.createQuery(query).getResultList();
    }
}
