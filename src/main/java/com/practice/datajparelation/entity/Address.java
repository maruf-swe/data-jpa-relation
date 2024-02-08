package com.practice.datajparelation.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

    @Id
    private Integer id;
    private String streetName;

    private  String houseNumber;
    private String zipCode;
}
