package com.example.GalvanizeCapstone.employees;

import com.example.GalvanizeCapstone.managers.Manager;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table( name = "employees")
@Data

public class Employee {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private  String employee_name;

    @Column
    private  int employee_number;

    @ManyToOne
    @JoinColumn
    private Manager manager;
    public Employee(){}
}
