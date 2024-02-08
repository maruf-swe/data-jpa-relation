package com.practice.datajparelation.entity;

import jakarta.persistence.Id;

import java.time.LocalDate;

public class Employee {

    @Id
    private Integer empId;
    private String Identifier;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthDate;

}
