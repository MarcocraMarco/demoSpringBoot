package com.example.demo.student;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="student",
uniqueConstraints = {
        @UniqueConstraint(name="student_email_unique",columnNames = "email")
})
public class Student {
    @Id
    @NonNull
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="student_generator")
    @SequenceGenerator(name="student_generator",sequenceName="student_sequence",allocationSize = 1)
    @Column(name="id",updatable=false)
    private Long id;
    @Column(name="first_name",nullable=false,columnDefinition="TEXT")
    private String name;
    @Column(name="email",nullable=false)
    private String email;
    @Column(columnDefinition="TEXT")
    private LocalDate dateOfBirth;
    @Transient
    @Column(name="age")
    private Integer age;




}
