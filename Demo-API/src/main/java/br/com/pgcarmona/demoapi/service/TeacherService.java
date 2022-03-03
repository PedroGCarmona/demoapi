package br.com.pgcarmona.demoapi.service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pgcarmona.demoapi.dto.TeacherDTO;
import br.com.pgcarmona.demoapi.model.Teacher;
import br.com.pgcarmona.demoapi.repository.TeacherRepository;

@Service
public class TeacherService {
    
    @Autowired
    TeacherRepository teacherRepository;

    public void save(TeacherDTO teacherDTO){
        teacherRepository.save(new Teacher(teacherDTO));
    }

    public List<TeacherDTO> findAll(){
        return teacherRepository.findAll().stream().map(TeacherDTO::new).collect(Collectors.toList());
    }

    public TeacherDTO findById(Long id) throws Exception{
        TeacherDTO teacherDTO = new TeacherDTO(teacherRepository.findById(id).orElse(null));
        
        if(Objects.isNull(teacherDTO)){
            throw new Exception("No teacher with id: " + id);
        } else{
            return teacherDTO;
        }
    }

    public void deleteById(Long id) throws Exception{
        TeacherDTO teacherDTO = new TeacherDTO(teacherRepository.findById(id).orElse(null));

        if(Objects.isNull(teacherDTO)){
            throw new Exception("No teacher with id: " + id);
        } else{
            teacherRepository.deleteById(id);
        }
    }

}
