package br.com.pgcarmona.demoapi.dto.joins;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeacherStudentDTO {
    private Long teacherId;
    private String teacherName;
    private Long studentId;
    private String studentName;
}
