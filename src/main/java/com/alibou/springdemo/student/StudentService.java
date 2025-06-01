package com.alibou.springdemo.student;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Ali",
                        "BouAli",
                        LocalDate.now(),
                        "contact@aliboucoding.com",
                        34
                ),
                new Student(
                        "Adam",
                        "Ngazzou",
                        LocalDate.now(),
                        "adem.ngazzou@horizon-university.tn",
                        19
                )
        );
    }
}
