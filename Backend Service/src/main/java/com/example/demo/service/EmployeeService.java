package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.model.Employee;
import com.example.demo.model.ServiceResponse;

public interface EmployeeService {

	ServiceResponse<List<Employee>> getAllEmployee();
	
	ServiceResponse<Employee> createEmployee(EmployeeEntity employeeEntity);

	ServiceResponse<Employee> deleteEmployee(Long id);

	ServiceResponse<Employee> getEmployeeById(Long id);

	ServiceResponse<Employee> updateEmployee(Long id, EmployeeEntity employeeEntity);
}
