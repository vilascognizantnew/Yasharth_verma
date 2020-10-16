package com.cts.demo.dao.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cts.demo.model.Person;


public interface PersonJpaDao extends CrudRepository<Person,Integer>{
	
	
	
}
