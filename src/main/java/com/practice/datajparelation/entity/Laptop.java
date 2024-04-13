package com.practice.datajparelation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Laptop {
    @Id
    private int laptopId;
    private String laptopBrand;
    private String laptopModel;
    
    @OneToOne
    private Student student;
}
