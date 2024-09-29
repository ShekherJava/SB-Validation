package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.Employee;

public interface EmployeeService {
	boolean  persistEmployee(Employee employee);
	
	List<Employee> fetchEmployees();

}
