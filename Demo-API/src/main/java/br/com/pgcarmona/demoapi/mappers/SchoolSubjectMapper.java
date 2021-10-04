package br.com.pgcarmona.demoapi.mappers;

import org.mapstruct.Mapper;

import br.com.pgcarmona.demoapi.dto.SchoolSubjectDTO;
import br.com.pgcarmona.demoapi.model.SchoolSubject;

@Mapper(componentModel = "spring")
public interface SchoolSubjectMapper {
    SchoolSubjectDTO schoolSubjectToSchoolSubjectDto(SchoolSubject schoolSubject);
    SchoolSubject schoolSubjectDTOToSchoolSubject(SchoolSubjectDTO schoolSubjectDTO);
}
