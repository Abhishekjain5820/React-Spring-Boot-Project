package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.model.Employee;
import com.example.demo.model.ServiceResponse;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	@Override
	public ServiceResponse<List<Employee>> getAllEmployee() {
		List<Employee> employees = this.employeeDao.getAllEmployee();
		return new ServiceResponse<List<Employee>>(200, true, false, "Sucessfully found list of employee", employees);
	}
	@Override
	public ServiceResponse<Employee> createEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		Employee resEmployee=this.employeeDao.createEmployee(employeeEntity);
		
		System.out.println(employeeEntity);
		return new ServiceResponse<Employee>(200,true,false,"Successfully added a employee",resEmployee);
	}
	@Override
	public ServiceResponse<Employee> deleteEmployee(Long id) {
	    Employee resEmployee = this.employeeDao.deleteEmployee(id);
	    return new ServiceResponse<Employee>(200, true, false, "Successfully deleted an employee", resEmployee);
	}
	@Override
	public ServiceResponse<Employee> getEmployeeById(Long id) {
		Employee resEmployee = this.employeeDao.getEmployeeById(id);
	    return new ServiceResponse<Employee>(200, true, false, "Successfully found an employee", resEmployee);
	}
	@Override
	public ServiceResponse<Employee> updateEmployee(Long id, EmployeeEntity employeeEntity) {
		Employee resEmployee = this.employeeDao.updateEmployee(id,employeeEntity);
	    return new ServiceResponse<Employee>(200, true, false, "Successfully updated an employee", resEmployee);
	}


}
