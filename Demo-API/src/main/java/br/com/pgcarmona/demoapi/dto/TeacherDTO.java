package br.com.pgcarmona.demoapi.dto;

import br.com.pgcarmona.demoapi.model.Teacher;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeacherDTO {
    private Long id;
    private String name;

    public TeacherDTO(Teacher teacher){
        this.id = teacher.getId();
        this.name = teacher.getName();
    }
}
