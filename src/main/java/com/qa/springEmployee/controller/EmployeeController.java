package com.qa.springEmployee.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springEmployee.domain.Employee;
import com.qa.springEmployee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private EmployeeService service;
	
	private EmployeeController(EmployeeService service) {
		this.service = service;
	}
	
	//Creating a new employee entry
	
	@PostMapping("/create")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		
		System.out.println("CREATING A NEW EMPLOYEE DATA");
		return new ResponseEntity<Employee>(this.service.create(employee), HttpStatus.CREATED);
		
		}
	
	//Read All

	@GetMapping("/readAll")
	
	public ResponseEntity<List<Employee>> readAllEmployee() {
		
		System.out.println("READING EMPLOYEE DATA AVAILABLE IN THE DATABASE");
		return new ResponseEntity<List<Employee>>(this.service.getAll(), HttpStatus.OK);
	}
	
	//Read By Id

	@GetMapping("/readById/{id}") 
	
	public ResponseEntity<Employee>getById(@PathVariable long id) {
		return new ResponseEntity<Employee>(this.service.getById(id), HttpStatus.OK);
		
	}
	
	//Update
	@PutMapping("/update/{id}")
	
	public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employee) {
		return new ResponseEntity<Employee>(this.service.update(id, employee), HttpStatus.ACCEPTED);
	}
 
	//Delete
	
	@DeleteMapping("/delete/{id}")
	
	public ResponseEntity<Boolean> deleteEmployee(@PathVariable long id) {
		return (this.service.delete(id)) ? new ResponseEntity<Boolean>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}


}


