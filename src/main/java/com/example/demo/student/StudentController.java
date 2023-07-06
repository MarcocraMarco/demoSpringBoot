package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/students")

public class StudentController {

    private final StudentService studentService;

    @Autowired //this tag will tell that the instance of such class must be injected
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudent() {
        return studentService.getStudents();
    }
    @PostMapping("/add")@ResponseStatus(HttpStatus.CREATED)
    public void registerNewStudent(@RequestBody Student student ){
        studentService.addNewStudent(student);

    }

}
