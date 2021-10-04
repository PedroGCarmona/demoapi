package br.com.pgcarmona.demoapi.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeacherDTO {
    private Long id;
    private String name;
}
