package com.example.demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.convertor.EmployeeConvertor;
import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	EmployeeConvertor employeeConvertor;
	
	
	@Override
	public List<Employee> getAllEmployee() {
		List<EmployeeEntity> employeeEntities = this.employeeRepository.findAll();
		return this.employeeConvertor.listOfEmployeeEnitityToListOfEmployee(employeeEntities);
	}


	@Override
	public Employee createEmployee(EmployeeEntity employeeEntity) {
		EmployeeEntity resEmployeeEntity=this.employeeRepository.save(employeeEntity);
		return  this.employeeConvertor.employeeEntityToEmployee(resEmployeeEntity);
	}
	
	@Override
	public Employee deleteEmployee(Long id) {
		EmployeeEntity resEmployeeEntity=this.employeeRepository.findById(id).get();
		this.employeeRepository.deleteById(id);
		return  this.employeeConvertor.employeeEntityToEmployee(resEmployeeEntity);
		
		
	}


	@Override
	public Employee getEmployeeById(Long id) {
		EmployeeEntity resEmployeeEntity=this.employeeRepository.findById(id).get();
		return  this.employeeConvertor.employeeEntityToEmployee(resEmployeeEntity);
		
	}


	@Override
	public Employee updateEmployee(Long id, EmployeeEntity employeeEntity) {
		EmployeeEntity resEmployeeEntity=this.employeeRepository.findById(id).get();
		resEmployeeEntity.setFirstName(employeeEntity.getFirstName());
		resEmployeeEntity.setLastName(employeeEntity.getLastName());
		resEmployeeEntity.setEmailId(employeeEntity.getEmailId());
		this.employeeRepository.save(resEmployeeEntity);
		return  this.employeeConvertor.employeeEntityToEmployee(resEmployeeEntity);
	}

}
