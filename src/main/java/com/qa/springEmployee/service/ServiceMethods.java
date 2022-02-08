package com.qa.springEmployee.service;

import java.util.List;

public interface ServiceMethods  <T> {
	
	

	// CRUD Method -----Create, Read, Update and Delete
	// This shows the methods that will be called with Postman
	
	
		//Create
		T create(T t);
		
		//Read All
		List<T> getAll();
		
		//Read By Id
		T getById(long id);
		
		//Update
		T update(long id, T t);
		
		//Delete
		boolean delete(long id);
		
}

