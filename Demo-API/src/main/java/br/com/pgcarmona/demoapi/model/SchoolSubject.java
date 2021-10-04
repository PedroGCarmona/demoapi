package br.com.pgcarmona.demoapi.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.pgcarmona.demoapi.model.joins.StudentSubject;
import br.com.pgcarmona.demoapi.model.joins.TeacherSubject;
import lombok.Data;

@Entity
@Table(name = "school_subject")
@Data
public class SchoolSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "sbj_name")
    private String name;
    @OneToMany(mappedBy = "subject")
    private List<StudentSubject> students;
    @OneToMany(mappedBy = "subject")
    private List<TeacherSubject> teachers;
}
