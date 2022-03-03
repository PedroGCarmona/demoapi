package br.com.pgcarmona.demoapi.service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pgcarmona.demoapi.dto.SchoolSubjectDTO;
import br.com.pgcarmona.demoapi.model.SchoolSubject;
import br.com.pgcarmona.demoapi.repository.SchoolSubjectRepository;


@Service
public class SchoolSubjectService {
    
    @Autowired
    SchoolSubjectRepository schoolSubjectRepository;

    public void save(SchoolSubjectDTO schoolSubjectDTO){
        schoolSubjectRepository.save(new SchoolSubject(schoolSubjectDTO));
    }

    public List<SchoolSubjectDTO> findAll(){
        return schoolSubjectRepository.findAll().stream().map(SchoolSubjectDTO::new).collect(Collectors.toList());
    }

    public SchoolSubjectDTO findById(Long id) throws Exception{
        SchoolSubjectDTO schoolSubjectDTO = new SchoolSubjectDTO(schoolSubjectRepository.findById(id).orElse(null));
        
        if(Objects.isNull(schoolSubjectDTO)){
            throw new Exception("No school subject with id: " + id);
        } else{
            return schoolSubjectDTO;
        }
    }

    public void deleteById(Long id) throws Exception{
        SchoolSubjectDTO schoolSubjectDTO = new SchoolSubjectDTO(schoolSubjectRepository.findById(id).orElse(null));
        
        if(Objects.isNull(schoolSubjectDTO)){
            throw new Exception("No school subject with id: " + id);
        } else{
            schoolSubjectRepository.deleteById(id);
        }
    }

}
