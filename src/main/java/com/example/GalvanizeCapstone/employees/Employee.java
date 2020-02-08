package com.example.GalvanizeCapstone.employees;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table( name = "members")
@Data

public class Employee {

    public Employee(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private  String employee_name;

    @Column
    private  int employee_number;

//    @OneToOne
//    @JoinColumn
//    private Manager manager;
}
