package com.h2.prueba.config;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.h2.pruebas.config.JPAStreamerConfig;

@ExtendWith(MockitoExtension.class)
class JPAStreamerConfigTest {
	
	@Mock
	private JPAStreamerConfig  config;
	
	@Test
	void streamFunctionTest() {
		Assertions.assertNull(config.jpaStreamer());
	}
}
