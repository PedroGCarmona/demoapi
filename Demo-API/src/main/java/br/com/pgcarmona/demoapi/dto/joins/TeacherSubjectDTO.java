package br.com.pgcarmona.demoapi.dto.joins;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeacherSubjectDTO {
    private Long teacherId;
    private String teacherName;
    private Long subjectId;
    private String subjectName;
}
