package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.repository.EmpRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmpRepository empRepo;

	@Override
	public boolean persistEmployee(Employee employee) {
		if ( !empRepo.existsById(employee.getEmpno()))
		{
			empRepo.save(employee);
			return true;
		}
		else
			return false;
	}
	
	@Override
	public List<Employee> fetchEmployees() {
		return (List<Employee>)empRepo.findAll();
	}

}
