package com.sourav.tddbdddemo.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PersonServiceTest {
	@Autowired
	private PersonService service;

	@Test
	void createSourav() {
		Person savePerson = this.service.savePerson(new Person(null, "Sourav"));
		System.out.println(savePerson);
		listAll();
	}

	@Test
	void createPrince() {
		Person savePerson = this.service.savePerson(new Person(null, "Prince"));
		System.out.println(savePerson);
		listAll();
	}

	@Test
	void listAll() {
		System.out.println(this.service.findAllPerson());
	}

}
