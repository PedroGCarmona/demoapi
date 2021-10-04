package br.com.pgcarmona.demoapi.mappers;

import org.mapstruct.Mapper;

import br.com.pgcarmona.demoapi.dto.StudentDTO;
import br.com.pgcarmona.demoapi.model.Student;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentDTO studentToStudentDto(Student student);
    Student studentDTOToStudent(StudentDTO studentDTO);
}
