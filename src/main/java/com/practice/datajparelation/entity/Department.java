package com.practice.datajparelation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Department {

    @Id
    private Integer Id;
    private String depName;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

}
