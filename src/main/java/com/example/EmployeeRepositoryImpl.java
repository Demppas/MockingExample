package com.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private List<Employee> database = new ArrayList<Employee>();

    @Override
    public List<Employee> findAll() {
        List<Employee> allEmployees = new ArrayList<>();
        for (int i = 0; i < database.size(); i++) {
            allEmployees.add(database.get(i));
        }
        return allEmployees;
    }

    @Override
    public Employee save(Employee e) {
        database.add(e);
        return e;
    }
}
