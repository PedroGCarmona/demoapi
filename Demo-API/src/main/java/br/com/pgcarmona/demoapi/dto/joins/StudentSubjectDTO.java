package br.com.pgcarmona.demoapi.dto.joins;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentSubjectDTO {
    private Long studentId;
    private String studentName;
    private Long subjectId;
    private String subjectName;
}
