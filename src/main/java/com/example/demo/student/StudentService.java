package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service  // this tag will tell that this class has to be instanced by the container once Injected
public class StudentService {
    private final StudentRepository studentRepository;
    /*so now, instead of having this list we are going to use dependency injection in order inject StudentRepository*/
    @Autowired //this tag will tell that the instance of such class must be injected
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent(){
        return studentRepository.findAll();
                //List.of(new Student(1L,"Pippo","something@mail.it", LocalDate.of(2000, Month.APRIL,4),22));
    }

    public void addNewStudent(Student student) {
        System.out.println(student);



    }


}
