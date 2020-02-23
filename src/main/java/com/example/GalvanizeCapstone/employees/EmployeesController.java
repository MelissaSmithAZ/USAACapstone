package com.example.GalvanizeCapstone.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("employee")
public class EmployeesController {

    @Autowired
    private final EmployeesService employeesService;

    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return  this.employeesService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getOneEmployee(@PathVariable int id) {
        Employee employee = employeesService.getOneEmployee(id).orElseThrow(IllegalArgumentException::new);
        return employee;
    }

    @PostMapping
    public Employee addOneEmployee(@RequestBody Employee newEmployee) {
        if (newEmployee.getEmployee_name() == null || newEmployee.getEmployee_number() <0){
            throw new IllegalArgumentException("Not all fields are valid. Go back and make sure all fields are valid " +
                    "before API call is made.");
        }
        return employeesService.addOneEmployee(newEmployee);
    }

    @PatchMapping
    public Employee updateOneEmployee(@RequestBody Employee updatedEmployee) {
        Employee employee = employeesService.getOneEmployee(updatedEmployee.getId()).orElseThrow(IllegalArgumentException::new);
        return employeesService.updateOneEmployee(updatedEmployee);
    }

    @DeleteMapping("/{id}")
    public String removeOneEmployee(@PathVariable int id) {
        Employee employee = employeesService.getOneEmployee(id).orElseThrow(IllegalArgumentException::new);
        return employeesService.removeOneEmployee(id);
    }
}
