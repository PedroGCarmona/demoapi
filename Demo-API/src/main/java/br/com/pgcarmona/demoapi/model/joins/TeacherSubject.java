package br.com.pgcarmona.demoapi.model.joins;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.pgcarmona.demoapi.model.SchoolSubject;
import br.com.pgcarmona.demoapi.model.Teacher;
import lombok.Data;

@Entity
@Table(name = "teacher_subject")
@Data
public class TeacherSubject implements Serializable{
    @Id
    @ManyToOne()
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    @Id
    @ManyToOne()
    @JoinColumn(name = "subject_id")
    private SchoolSubject subject;
}
