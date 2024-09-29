package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Entity.Employee;
import com.example.demo.service.EmployeeService;

import jakarta.validation.Valid;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@GetMapping("/add")
	public String getAddEmployeePage(Model model) {
		model.addAttribute("employee", new Employee());
		return "AddEmployee";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@Valid @ModelAttribute Employee employee, BindingResult result, Model model ) {
		if(result.hasErrors()) {
			return "AddEmployee";
		}
		else {
			boolean flag = empService.persistEmployee(employee);
			if(flag) {
				model.addAttribute("message", "Employee added to the database");
				List<Employee> lstEmp = empService.fetchEmployees();
				model.addAttribute("lstEmp", lstEmp);
				return "EmployeesList";
			}
			else {
				model.addAttribute("message", "Employee already exist in the database");
				List<Employee> lstEmp = empService.fetchEmployees();
				model.addAttribute("lstEmp", lstEmp);
				return "EmployeesList";
				
			}
			
		}
		
	}

}
