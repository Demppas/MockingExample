package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void TestGetId(){
        var employee = new Employee("1", 10000);
        assertEquals("1", employee.getId());
    }

    @Test
    void TestGetSalary(){
        var employee = new Employee("1", 10000);
        assertEquals(10000, employee.getSalary());
    }
    @Test
    void TestSetId(){
        var employee = new Employee("1", 10000);
        employee.setId("2");
        assertEquals("2", employee.getId());
    }

    @Test
    void TestSetSalary(){
        var employee = new Employee("1", 10000);
        employee.setSalary(20000);
        assertEquals(20000, employee.getSalary());
    }
    @Test
    void TestIsPaid(){
        var employee = new Employee("1", 10000);
        assertFalse(employee.isPaid());
    }
    @Test
    void TestSetPaid(){
        var employee = new Employee("1", 10000);
        employee.setPaid(true);
        assertTrue(employee.isPaid());
    }
    @Test
    void TestReturnStringWithIdAndSalary(){
        var employee = new Employee("1", 10000);
        String expected = "Employee [id=1, salary=10000.0]";
        assertEquals(expected, employee.toString());
    }
    @Test
    void TestEquals(){
        var employee1 = new Employee("1", 10000);
        var employee2 = new Employee("1", 10000);
        assertEquals(employee1, employee2);
    }
}