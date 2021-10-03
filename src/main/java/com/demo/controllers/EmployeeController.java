package com.demo.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Employee;
import com.demo.services.EmployeeService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    
    @Autowired
    EmployeeService service;

    @GetMapping("")
    @ApiOperation(
        value = "Find all employee",
        notes = "Header is not required",
        response = List.class
    )
    public List<Employee> getEmployees(){
        return service.getEmployees();
    }

    @GetMapping("{id}")
    public Employee getEmployee(@PathVariable int id){
        return service.getEmployee(id);
    }

    @PostMapping("")
    public Employee addEmployee(@RequestBody Employee emp){
        return service.saveEmployee(emp);
    }

}

