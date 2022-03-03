package br.com.pgcarmona.demoapi.service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pgcarmona.demoapi.dto.StudentDTO;
import br.com.pgcarmona.demoapi.model.Student;
import br.com.pgcarmona.demoapi.repository.StudentRepository;
import br.com.pgcarmona.demoapi.repository.Implements.StudentRepositoryImpl;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentRepositoryImpl studentRepositoryImpl;

    public void save(StudentDTO studentDTO){
        studentRepository.save(new Student(studentDTO));
    }

    public List<StudentDTO> findAll(){
        return studentRepository.findAll().stream().map(StudentDTO::new).collect(Collectors.toList());
    }

    public StudentDTO findById(Long id) throws Exception{
        StudentDTO studentDTO = new StudentDTO(studentRepository.findById(id).orElse(null));
        
        if(Objects.isNull(studentDTO)){
            throw new Exception("No student with id: " + id);
        } else{
            return studentDTO;
        }
    }

    public void deleteById(Long id) throws Exception{
        StudentDTO studentDTO = new StudentDTO(studentRepository.findById(id).orElse(null));
        
        if(Objects.isNull(studentDTO)){
            throw new Exception("No student with id: " + id);
        } else{
            studentRepository.deleteById(id);
        }
    }

    public List<StudentDTO> findByTeacher(Long teacherId){
        return studentRepositoryImpl.findByTeacher(teacherId).stream().map(StudentDTO::new).collect(Collectors.toList());
    }

}
