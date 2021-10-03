package com.demo.services;

import java.util.List;

import com.demo.entities.Employee;
import com.demo.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    
    @Autowired
    EmployeeRepository repository;

    public List<Employee> getEmployees(){
        return repository.findAll();
    }

    public Employee getEmployee(int id) {
        return repository.findById(id).orElse(null);
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }


}
