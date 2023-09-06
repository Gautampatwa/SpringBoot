package com.example.Employee.controller;


import com.example.Employee.entities.Employee;
import com.example.Employee.services.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        Employee employee1 = employeeService.createEmployee(employee);
        return employee1;
    }

    @GetMapping("/get")
    public List<Employee> getAllEmployee() {
        List<Employee> allEmployee = employeeService.getAllEmployee();
        return allEmployee;
    }//
    @GetMapping("/get/{id}")
    public Optional<Employee> getEmpById(@PathVariable("id") int id) {
        Optional<Employee> empById = employeeService.getEmpById(id);
        return empById;
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("id") int id) {
        Employee employee2 = employeeService.updateEmpById(employee, id);
        return employee2;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmp(@PathVariable("id") int id) {
        employeeService.delete(id);
    }
}
