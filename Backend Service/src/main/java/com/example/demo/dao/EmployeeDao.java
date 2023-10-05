package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.model.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployee();
	
	public Employee createEmployee(EmployeeEntity employeeEntity);

	public Employee deleteEmployee(Long id);

	public Employee getEmployeeById(Long id);

	public Employee updateEmployee(Long id, EmployeeEntity employeeEntity);

	 
}
