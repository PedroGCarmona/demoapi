package br.com.pgcarmona.demoapi.model.joins;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.pgcarmona.demoapi.model.Student;
import br.com.pgcarmona.demoapi.model.Teacher;
import lombok.Data;

@Entity
@Table(name = "teacher_student")
@Data
public class TeacherStudent implements Serializable{
    @Id
    @ManyToOne()
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    @Id
    @ManyToOne()
    @JoinColumn(name = "student_id")
    private Student student;
}
