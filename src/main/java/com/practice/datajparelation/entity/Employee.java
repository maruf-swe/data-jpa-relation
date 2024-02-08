package com.practice.datajparelation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue
    private Integer empId;
    private String Identifier;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthDate;


    @Enumerated(EnumType.STRING)
    private EmployeeRole employeeRole;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

}
