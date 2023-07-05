package com.example.demo.student;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @NonNull
    private Long  id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;
    private Integer age;

}
