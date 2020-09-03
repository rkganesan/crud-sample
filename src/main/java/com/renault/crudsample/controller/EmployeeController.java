package com.renault.crudsample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.renault.crudsample.model.Employee;
import com.renault.crudsample.service.EmployeeService;

@RestController
public class EmployeeController {

@Autowired
EmployeeService employeeService;

@PostMapping("/employees")  
private String saveEmployee(@RequestBody Employee employees)   
{  
	employeeService.saveOrUpdate(employees);  
	return employees.getEmp_id();
}

@GetMapping("/employee")  
private List<Employee> getAllEmployees()   
{  
	return employeeService.getAllEmployees();
}

@GetMapping("/employee/{empId}")  
private Employee getEmployee(@PathVariable("empId") String empId)   
{  
	return employeeService.getEmployeeById(empId);
}

@DeleteMapping("/employee/{empId}")  
private void deleteEmployee(@PathVariable("empId") String empId)   
{  
	employeeService.deleteEmployee(empId);	 
}

@PutMapping("/employees")  
private Employee updatEmployee(@RequestBody Employee employees)   
{  
	employeeService.saveOrUpdate(employees);  
	return employees;
}

}
