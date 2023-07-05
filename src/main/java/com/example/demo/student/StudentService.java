package com.example.demo.student;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service  // this tag will tell that this class has to be instanced by the container once Injected
public class StudentService {
    public List<Student> getStudent(){
        return List.of(new Student(1L,"Pippo","something@mail.it", LocalDate.of(2000, Month.APRIL,4),22));
    }
}
