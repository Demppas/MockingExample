package com.example;

import java.util.Objects;

public class Employee {

	private String id;
	private double salary;
	private boolean paid;

	public Employee(String id, double salary) {
		this.id = id;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) return true;
		if (object == null || getClass() != object.getClass()) return false;
		Employee employee = (Employee) object;
		return Double.compare(salary, employee.salary) == 0 && paid == employee.paid && Objects.equals(id, employee.id);
	}
}
