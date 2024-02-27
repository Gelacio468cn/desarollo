package com.h2.prueba.model.response;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ResponseTest {
	
	private static final String currency ="EUR";
	private static final String product = "35455";
	private static final String fecha ="2020-06-14";
	private static final String hora ="15.00.00";
	private static final String endDate ="2020-12-31-23.59.59";
	private static final String startDate = fecha.concat("-").concat(hora);
	
	
	Response response;
	
	@BeforeEach
	public void init() {
		response = new Response();
		response.setBrandId(1L);
		response.setEndDate(endDate);
		response.setPrice(new BigDecimal(35.5));
		response.setPriceList(1);
		response.setProductId(product);
		response.setStartDate(startDate);
	}
	
	@Test
	void pricesTest() {
		Assertions.assertNotNull(response.getBrandId());
		Assertions.assertNotNull(response.getEndDate());
		Assertions.assertNotNull(response.getPriceList());
		Assertions.assertNotNull(response.getProductId());
		Assertions.assertNotNull(response.getStartDate());
		Assertions.assertNotNull(response.getPrice());
	}
}
