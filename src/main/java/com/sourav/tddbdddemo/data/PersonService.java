package com.sourav.tddbdddemo.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;

	public Person savePerson(Person entity) {
		return this.personRepository.save(entity);
	}

	public List<Person> findAllPerson() {
		return this.personRepository.findAll();
	}

}
