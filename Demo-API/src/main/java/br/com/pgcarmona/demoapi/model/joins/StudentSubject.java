package br.com.pgcarmona.demoapi.model.joins;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.pgcarmona.demoapi.model.SchoolSubject;
import br.com.pgcarmona.demoapi.model.Student;
import lombok.Data;

@Entity
@Table(name = "student_subject")
@Data
public class StudentSubject implements Serializable{
    @Id
    @ManyToOne()
    @JoinColumn(name = "student_id")
    private Student student;
    @Id
    @ManyToOne()
    @JoinColumn(name = "subject_id")
    private SchoolSubject subject;
}
