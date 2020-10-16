package com.cts.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.cts.demo.model.Person;

public interface PersonDao {
	public List<Person> getAllPerson();
	public Person getPersonById(int id);
	public Person addPerson(Person person);
	public Person updatePerson(Person person);
	
}
