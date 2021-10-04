package br.com.pgcarmona.demoapi.mappers;

import org.mapstruct.Mapper;

import br.com.pgcarmona.demoapi.dto.TeacherDTO;
import br.com.pgcarmona.demoapi.model.Teacher;

@Mapper(componentModel = "spring")
public interface TeacherMapper {
    TeacherDTO teacherToTeacherDTO(Teacher teacher);
    Teacher teacherDTOToTeacher(TeacherDTO teacherDTO);
}
