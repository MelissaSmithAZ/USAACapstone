package com.example.GalvanizeCapstone.managers;

import com.example.GalvanizeCapstone.employees.Employee;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table( name = "managers")
@Data


public class Manager {

    public Manager(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private  String manager_name;

    @Column
    private  int manager_employee_number;

    @OneToMany
    @JoinColumn
    private Employee employee;
}
