package com.example.University.Event.Management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity // used to create table in db
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // used to make id as primary key and autoincreament
    private int studentId;
    @Pattern(regexp = "[A-Z]\\w*",message = "First Letter should be Capital !!")
    private String firstName;
    private String lastName;
    @Max(value = 25,message = "Age should be <= 25 !!")
    @Min(value = 18,message = "Age should be >= 18 !!")
    private int age;
    private String department;
}
