package br.com.pgcarmona.demoapi.dto;

import br.com.pgcarmona.demoapi.model.SchoolSubject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SchoolSubjectDTO {
    private Long id;
    private String name;

    public SchoolSubjectDTO(SchoolSubject schoolSubject){
        this.id = schoolSubject.getId();
        this.name = schoolSubject.getName();
    }
}
