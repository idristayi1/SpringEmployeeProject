package com.qa.springEmployee.service;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.springEmployee.domain.Employee;
import com.qa.springEmployee.repo.EmployeeRepo;

@Service
public class EmployeeService implements ServiceMethods <Employee> {
	

private EmployeeRepo repo;

public EmployeeService(EmployeeRepo repo) {

	
	this.repo =repo;
}
	@Override
	public Employee create(Employee employee) {
		System.out.println("Entrying a new employee detail...wait while I get the environment ready");

	return this.repo.save(employee);
	}

	@Override
	public List<Employee> getAll() {
		System.out.println("Reading the available employee details in the database, give me a little while");

		return this.repo.findAll();
	}

	@Override
	public Employee getById(long id) {
		System.out.println("Reading the available employee details in the database by Id, give me a little while");

		Optional<Employee> optionalEmployee = this.repo.findById(id);
		if(optionalEmployee.isPresent()) {
			return optionalEmployee.get();
		}
		 
		return null;
	}

	@Override
	public Employee update(long id, Employee employee) {
		System.out.println("Updating specific details on the identified employee");

		Optional<Employee> existingEmployee = this.repo.findById(id);
		if(existingEmployee.isPresent()) {
			
			Employee existing = existingEmployee.get();
			existing.setSex(employee.getSex());
			existing.setFirstname(employee.getFirstname());
			existing.setMobileNo(employee.getMobileNo());
				
			return this.repo.saveAndFlush(existing);
			
		}
		return null;
	}

	@Override
	public boolean delete(long id) {
		System.out.println("Deleting employee data from the database");

		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}
	



}


