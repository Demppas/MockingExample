package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EmployeesTest {
    @Mock
    private EmployeeRepository mockEmployeeRepository;
    @Mock
    private BankService mockBankService;

    @InjectMocks
    private Employees employees;


    @Test
    public void returnTrueIfEmployeeAreSaved(){
        List<Employee> ListOfEmployees = new ArrayList<>();
        var employeeOne = new Employee("1", 10000);
        ListOfEmployees.add(employeeOne);
        when(mockEmployeeRepository.findAll()).thenReturn(ListOfEmployees);
        assertTrue(mockEmployeeRepository.findAll().contains(employeeOne));
    }

    @Test
    public void ReturnTrueIfEmployeeIsPaid(){
        List<Employee> ListOfEmployees = new ArrayList<>();
        var employeeOne = new Employee("1", 10000);
        ListOfEmployees.add(employeeOne);
        when(mockEmployeeRepository.findAll()).thenReturn(ListOfEmployees);
        employees.payEmployees();
        assertThat(mockEmployeeRepository.findAll()).allSatisfy(employee -> assertTrue(employee.isPaid()));
    }

}
