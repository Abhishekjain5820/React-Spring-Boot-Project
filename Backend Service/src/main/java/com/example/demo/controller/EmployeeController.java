package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.model.ApiResponse;
import com.example.demo.model.Employee;
import com.example.demo.model.ServiceResponse;
import com.example.demo.service.EmployeeService;

@CrossOrigin(origins = "http://127.0.0.1:5173/")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	// get all employee
	@GetMapping("/employees")
	public ResponseEntity<ApiResponse<List<Employee>>> getAllEmployees() {
		ServiceResponse<List<Employee>> serviceResponse = this.employeeService.getAllEmployee();
		ApiResponse<List<Employee>> apiResponse = new ApiResponse<List<Employee>>(200, serviceResponse.getMessage(),
				serviceResponse.getBody());
		return new ResponseEntity<ApiResponse<List<Employee>>>(apiResponse, null, 200);
	 }

	//create an employee
		@PostMapping("/employees")
		public ResponseEntity<ApiResponse<Employee>> createEmployee(@RequestBody EmployeeEntity employeeEntity){
			ServiceResponse<Employee>serviceResponse=this.employeeService.createEmployee(employeeEntity);
			ApiResponse<Employee>apiResponse=new ApiResponse<Employee>(200,serviceResponse.getMessage(),serviceResponse.getBody());
			return new ResponseEntity<ApiResponse<Employee>>(apiResponse,null,200);
			
		}
		@DeleteMapping("/employees/{id}")
		public ResponseEntity<ApiResponse<Employee>>deleteEmployee(@PathVariable("id") Long id){
			ServiceResponse<Employee>serviceResponse=this.employeeService.deleteEmployee(id);
			ApiResponse<Employee>apiResponse=new ApiResponse<Employee>(200,serviceResponse.getMessage(),serviceResponse.getBody());
			return new ResponseEntity<ApiResponse<Employee>>(apiResponse,null,200);
		}
		
		@GetMapping("/employees/{id}")
		public ResponseEntity<ApiResponse<Employee>>getEmployeeById(@PathVariable("id") Long id){
			ServiceResponse<Employee>serviceResponse=this.employeeService.getEmployeeById(id);
			ApiResponse<Employee>apiResponse=new ApiResponse<Employee>(200,serviceResponse.getMessage(),serviceResponse.getBody());
			return new ResponseEntity<ApiResponse<Employee>>(apiResponse,null,200);
		}
		@PutMapping("/employees/{id}")
		public ResponseEntity<ApiResponse<Employee>>updateEmployee(@PathVariable("id") Long id ,@RequestBody EmployeeEntity employeeEntity ){
			ServiceResponse<Employee>serviceResponse=this.employeeService.updateEmployee(id,employeeEntity);
			ApiResponse<Employee>apiResponse=new ApiResponse<Employee>(200,serviceResponse.getMessage(),serviceResponse.getBody());
			return new ResponseEntity<ApiResponse<Employee>>(apiResponse,null,200);
		}
		

}
