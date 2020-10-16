package com.cts.demo.service;

import java.util.List;

import com.cts.demo.model.Person;

public interface PermanentPersonService {
	
	public Iterable<Person> getAllPerson();
	public Person getPersonById(int id);
	public Person addPerson(Person person);
	public Person updatePerson(Person person);

}
