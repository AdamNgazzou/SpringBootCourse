package com.alibou.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    // bean Field injection
    // @Autowired
    private StudentService service ;

    // bean Constructor injection (recommended)
    @Autowired //you can remove Autowired in newer versions of Spring
    public StudentController(StudentService service) {
        this.service = service;
    }


    @PostMapping
    public Student save(@RequestBody Student s){
        return service.save(s);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email){
        return service.findByEmail(email);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student s){
        return service.updateStudent(s);
    }
    @DeleteMapping("/{email}")
    public void deleteByEmail(@PathVariable("email") String email){
        service.deleteByEmail(email);
    }

    @GetMapping
    public List<Student> findAllStudents(){
        return service.findAllStudents();
    }
}