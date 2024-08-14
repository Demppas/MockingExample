package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeRepositoryImplTest {

    private EmployeeRepository repository;

    @BeforeEach
    void setUp(){
        repository = new EmployeeRepositoryImpl();
        var employee1 = new Employee("1", 10000);
        var employee2 = new Employee("2", 20000);
        repository.save(employee1);
        repository.save(employee2);
    }

    @Test
    void saveEmployee(){
    var employee = new Employee("3", 30000);
        var addedEmployee = repository.save(employee);
        assertEquals(addedEmployee, employee);
    }

    @Test
    void findAllEmployees(){
        List<Employee> existedEmployees = new ArrayList<>();
        existedEmployees.add(new Employee("1", 10000));
        existedEmployees.add(new Employee("2", 20000));
        assertEquals(existedEmployees, repository.findAll());
    }

}
