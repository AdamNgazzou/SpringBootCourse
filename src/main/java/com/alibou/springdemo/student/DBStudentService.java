package com.alibou.springdemo.student;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class DBStudentService implements StudentService {

    private final StudentRepository repository;

    public DBStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student save(Student s) {
        return repository.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student s) {
        return repository.save(s);
    }

    @Override
    public void deleteByEmail(String email) {
        repository.deleteByEmail(email);
    }
}
