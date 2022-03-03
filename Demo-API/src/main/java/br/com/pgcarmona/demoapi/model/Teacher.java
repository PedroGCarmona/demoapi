package br.com.pgcarmona.demoapi.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.pgcarmona.demoapi.dto.TeacherDTO;
import br.com.pgcarmona.demoapi.model.joins.TeacherStudent;
import br.com.pgcarmona.demoapi.model.joins.TeacherSubject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "teacher")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "tch_name")
    private String name;
    @OneToMany(mappedBy = "teacher")
    private List<TeacherSubject> subjects;
    @OneToMany(mappedBy = "teacher")
    private List<TeacherStudent> students;

    public Teacher(TeacherDTO teacherDTO){
        this.id = teacherDTO.getId();
        this.name = teacherDTO.getName();
    }
}
