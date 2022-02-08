package com.qa.springEmployee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.springEmployee.domain.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
