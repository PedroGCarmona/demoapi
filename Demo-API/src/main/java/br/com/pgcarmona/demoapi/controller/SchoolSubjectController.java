package br.com.pgcarmona.demoapi.controller;

import java.util.List;

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

import br.com.pgcarmona.demoapi.dto.SchoolSubjectDTO;
import br.com.pgcarmona.demoapi.service.SchoolSubjectService;

@RestController
@RequestMapping("/subject")
public class SchoolSubjectController {

    @Autowired
    SchoolSubjectService schoolSubjectService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody SchoolSubjectDTO schoolSubjectDTO){
        schoolSubjectService.save(schoolSubjectDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<SchoolSubjectDTO>> findAll(){
        return new ResponseEntity<>(schoolSubjectService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SchoolSubjectDTO> findById(@PathVariable Long id) throws Exception{
        return new ResponseEntity<>(schoolSubjectService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) throws Exception{
        schoolSubjectService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
