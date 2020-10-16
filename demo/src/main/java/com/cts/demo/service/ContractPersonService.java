package com.cts.demo.service;

import java.util.List;

import com.cts.demo.model.Person;

public interface ContractPersonService {
	
	public List<Person> getAllPerson();
	public Person getPersonById(int id);

}
