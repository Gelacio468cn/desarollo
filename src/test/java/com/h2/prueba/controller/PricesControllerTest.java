package com.h2.prueba.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import com.h2.prueba.model.response.PricesResponse;
import com.h2.prueba.service.PricesService;

@ExtendWith(MockitoExtension.class)
class PricesControllerTest {
	
	@InjectMocks
	private PricesController prices;
	
	@Mock
	private PricesService service;
		
	private final String product = "35455";
	private final String fecha ="2020-06-14";
	private final String hora ="15.00.00";
	private final String fecha2 ="2020-06-14";
	private final String hora2 ="16.00.00";
	private final String fecha3 ="2020-06-14";
	private final String hora3 ="21.00.00";
	private final String fecha4 ="2020-06-15";
	private final String hora4 ="10.00.00";
	private final String fecha5 ="2020-06-16";
	private final String hora5 ="21.00.00";
	
	@Test
	void PricesList() {
		ResponseEntity<PricesResponse> list = prices.pricesList(product,hora,fecha);
		Assertions.assertNotNull(list);
	}
	
	@Test
	void PricesListCase2() {
		ResponseEntity<PricesResponse> list = prices.pricesList(product,hora2,fecha2);
		Assertions.assertNotNull(list);
	}
	
	@Test
	void PricesListCase3() {
		ResponseEntity<PricesResponse> list = prices.pricesList(product,hora3,fecha3);
		Assertions.assertNotNull(list);
	}

	@Test
	void PricesListCase4() {
		ResponseEntity<PricesResponse> list = prices.pricesList(product,hora4,fecha4);
		Assertions.assertNotNull(list);
	}
	
	@Test
	void PricesListCase5() {
		ResponseEntity<PricesResponse> list = prices.pricesList(product,hora5,fecha5);
		Assertions.assertNotNull(list);
	}

}
