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
import org.springframework.web.bind.annotation.RestController;

import br.com.pgcarmona.demoapi.dto.TeacherDTO;
import br.com.pgcarmona.demoapi.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    
    @Autowired
    TeacherService teacherService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody TeacherDTO teacherDTO){
        teacherService.save(teacherDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TeacherDTO>> findAll(){
        return new ResponseEntity<>(teacherService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TeacherDTO> findById(@PathVariable Long id) throws Exception{
        TeacherDTO teacherDTO = teacherService.findById(id);
        if(!Objects.isNull(teacherDTO)){
            return new ResponseEntity<>(teacherDTO, HttpStatus.OK);
        } else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) throws Exception{
        teacherService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
