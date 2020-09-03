package com.renault.crudsample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renault.crudsample.model.Employee;
import com.renault.crudsample.repository.EmployeesRepository;

@Service
public class EmployeeService {

@Autowired
EmployeesRepository employeesRepository;

//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(Employee employee)   
{  
	employeesRepository.save(employee);
}

//getting all employee record by using the method findAll() of CrudRepository  
public List<Employee> getAllEmployees()   
{  
	List<Employee> employees = new ArrayList<Employee>();  
	employeesRepository.findAll().forEach(employees1 -> employees.add(employees1));  
	return employees;
}

//getting employee record by using the method findById() of CrudRepository
public Employee getEmployeeById(String id)
{
	return employeesRepository.findById(id).get();
}

//deleting employee record by using the method findById() of CrudRepository
public void deleteEmployee(String id)
{
	employeesRepository.deleteById(id);
}

//Updating employee 
public Employee updateEmployee(Employee emp, String id)
{
	employeesRepository.save(emp);
	return employeesRepository.findById(id).get();
	
}

}
