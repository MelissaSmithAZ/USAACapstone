package com.example.GalvanizeCapstone.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesService {

    @Autowired
    private final EmployeesRepository employeesRepository;

    public EmployeesService(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }
    public List<Employee> getAllEmployees() {
        return this.employeesRepository.findAll();
    }
    //when you put the <> it is the generic type
    public Optional<Employee> getOneEmployee(int id) {
        return employeesRepository.findById(id);
    }
    public Employee addOneEmployee(Employee newEmployee) {
        return employeesRepository.save(newEmployee);
    }
    public Employee updateOneEmployee(Employee updatedEmployee) {
        return employeesRepository.save(updatedEmployee);
    }
    public String removeOneEmployee(int id) {
        employeesRepository.deleteById(id);
        return "Id " + id + " was removed";
    }
}
