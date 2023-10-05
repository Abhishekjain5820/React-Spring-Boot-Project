package com.example.demo.convertor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.model.Employee;


//this class will convert the employeeentity in employee to send back to the fronted.In this way we can prevent the whole data
//to expose
@Service
public class EmployeeConvertor {

	//here if there is a field password then in employee model we will not send back to the user
	public Employee employeeEntityToEmployee(EmployeeEntity employeeEntity) {
		Employee employee = new Employee();
		employee.setEmailId(employeeEntity.getEmailId());
		employee.setFirstName(employeeEntity.getFirstName());
		employee.setLastName(employeeEntity.getLastName());
		employee.setId(employeeEntity.getId());
		
		return employee;
	}
	
	public List<Employee> listOfEmployeeEnitityToListOfEmployee(List<EmployeeEntity> employeeEntities){
		List<Employee> employees = new ArrayList<>();
		for(EmployeeEntity employeeEntity : employeeEntities)
			employees.add(this.employeeEntityToEmployee(employeeEntity));
		return employees;
			
	}
}
