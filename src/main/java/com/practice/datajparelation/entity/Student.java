package com.practice.datajparelation.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Student {

    @Id
    private int studentId;
    private String studentName;
    private String studentAbout;

    @OneToOne
    private Laptop laptop;
}
