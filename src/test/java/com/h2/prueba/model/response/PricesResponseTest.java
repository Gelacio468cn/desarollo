package com.h2.prueba.model.response;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PricesResponseTest {

	PricesResponse response;

	@BeforeEach
	public void init() {
		response = new PricesResponse();
		response.setData(new ArrayList<>());
	}

	@Test
	void responseTest() {
		Assertions.assertNotNull(response.getData());
	}
}
