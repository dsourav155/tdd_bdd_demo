package com.sourav.tddbdddemo;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class EmployeeTest {
	private Employee emp = new Employee();

	@Test
	void test() {
		emp.setName("Sourav");
		log.info(emp.getName());
	}

}
