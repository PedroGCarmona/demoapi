package br.com.pgcarmona.demoapi.dto;

import br.com.pgcarmona.demoapi.model.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    private Long id;
    private String name;

    public StudentDTO(Student student){
        this.id = student.getId();
        this.name = student.getName();
    }
}
