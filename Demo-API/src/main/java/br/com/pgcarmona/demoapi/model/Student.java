package br.com.pgcarmona.demoapi.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.pgcarmona.demoapi.dto.StudentDTO;
import br.com.pgcarmona.demoapi.model.joins.StudentSubject;
import br.com.pgcarmona.demoapi.model.joins.TeacherStudent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
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

    public Student(StudentDTO studentDTO){
        this.id = studentDTO.getId();
        this.name = studentDTO.getName();
    }
}
