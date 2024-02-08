package com.practice.datajparelation.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Address {

    @Id
    private Integer id;
    private String streetName;

    private  String houseNumber;
    private String zipCode;
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
