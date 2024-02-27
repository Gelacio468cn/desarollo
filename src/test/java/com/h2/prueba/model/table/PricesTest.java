package com.h2.prueba.model.table;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PricesTest {
	
	private static final String currency ="EUR";
	private static final String product = "35455";
	private static final String fecha ="2020-06-14";
	private static final String hora ="15.00.00";
	private static final String endDate ="2020-12-31-23.59.59";
	private static final String startDate = fecha.concat("-").concat(hora);
	
	Prices prices;
	
	@BeforeEach
	public void init() {
		prices = Prices.builder().
				brandId(1L)
				.currency(currency)
				.endDate(endDate)
				.price(new BigDecimal(35.5))
				.priceList(1)
				.priority(0)
				.productId(product)
				.startDate(startDate)
				.build();
	}
	
	@Test
	void pricesTest() {
		Assertions.assertNotNull(prices.getBrandId());
		Assertions.assertNotNull(prices.getCurrency());
		Assertions.assertNotNull(prices.getEndDate());
		Assertions.assertNotNull(prices.getPriceList());
		Assertions.assertNotNull(prices.getPriority());
		Assertions.assertNotNull(prices.getProductId());
		Assertions.assertNotNull(prices.getStartDate());
		Assertions.assertNotNull(prices.getPrice());
	}
}
