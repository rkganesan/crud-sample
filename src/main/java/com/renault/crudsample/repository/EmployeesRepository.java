package com.renault.crudsample.repository;

import org.springframework.data.repository.CrudRepository;

import com.renault.crudsample.model.Employee;

public interface EmployeesRepository extends CrudRepository<Employee, String> {

}
