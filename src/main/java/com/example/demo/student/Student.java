package com.example.demo.student;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Student {
    @Id
    @NonNull
    private Long id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;
    private Integer age;

}
