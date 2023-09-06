package com.example.Employee.entities;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private int id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Address", nullable = false)
    private String address;

    @Column(name = "Department", nullable = false)
    private String dept;

    @Column(name = "Salary", nullable = false)
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, String address, String dept, int salary, List<Bonus> bonusList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dept = dept;
        this.salary = salary;
        this.bonusList = bonusList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
    @Transient
    private List<Bonus> bonusList=new ArrayList<>();
}
