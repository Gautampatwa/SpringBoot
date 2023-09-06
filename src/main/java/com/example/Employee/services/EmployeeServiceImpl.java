package com.example.Employee.services;


import com.example.Employee.entities.Employee;
import com.example.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee createEmployee(Employee employee) {
        Employee save =employeeRepository.save(employee);
        return save;
    }

    public Optional<Employee> getEmpById(int id) {
        Optional<Employee> byId = employeeRepository.findById(id);
        return byId;
    }

    public List<Employee> getAllEmployee() {
        List<Employee> all = employeeRepository.findAll();
        return all;
    }

    public Employee updateEmpById(Employee employee, int id) {
        Employee existing = employeeRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Todo not found with given id"));
        existing.setAddress(employee.getAddress());
        existing.setDept(employee.getDept());
        existing.setName(employee.getName());
        existing.setSalary(employee.getSalary());
        Employee updated =employeeRepository.save(existing);
        return updated;
    }

    public void delete(int id) {
        employeeRepository.deleteById(id);

    }
}
