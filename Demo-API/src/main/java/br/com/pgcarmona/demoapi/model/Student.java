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
import br.com.pgcarmona.demoapi.model.joins.TeacherStudent;
import lombok.Data;

@Entity
@Table(name = "student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "std_name")
    private String name;
    @OneToMany(mappedBy = "student")
    private List<StudentSubject> subjects;
    @OneToMany(mappedBy = "student")
    private List<TeacherStudent> teachers;

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentSubject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<StudentSubject> subjects) {
        this.subjects = subjects;
    }

    public List<TeacherStudent> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<TeacherStudent> teachers) {
        this.teachers = teachers;
    }

}
