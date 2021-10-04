package br.com.pgcarmona.demoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pgcarmona.demoapi.model.SchoolSubject;

@Repository
public interface SchoolSubjectRepository extends JpaRepository<SchoolSubject, Long>{
    
}
