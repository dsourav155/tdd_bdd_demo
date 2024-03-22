package com.sourav.tddbdddemo.controllers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

class DefaultControllerTest {
	private DefaultController controller = new DefaultController();

	@Test
	void testSayHello() {
		ResponseEntity<String> resp = controller.sayHello();
		Assertions.assertThat(resp.getStatusCode()).isNotNull().isEqualTo(HttpStatus.OK);
		Assertions.assertThat(resp.getBody()).isNotNull().isEqualTo("Hello Sourav");

	}

}
