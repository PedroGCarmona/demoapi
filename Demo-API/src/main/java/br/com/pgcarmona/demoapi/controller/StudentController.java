package br.com.pgcarmona.demoapi.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.pgcarmona.demoapi.dto.StudentDTO;
import br.com.pgcarmona.demoapi.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody StudentDTO studentDTO){
        studentService.save(studentDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<StudentDTO>> findAll(){
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> findbyId(@PathVariable Long id) throws Exception{
        StudentDTO studentDTO = studentService.findById(id);
        if(!Objects.isNull(studentDTO)){
            return new ResponseEntity<>(studentDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) throws Exception{
        studentService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<StudentDTO>> findByParams(@RequestParam Long teacherId){
        return new ResponseEntity<>(studentService.findByTeacher(teacherId), HttpStatus.OK);
    }
    
}
