package com.h2.prueba.mapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.h2.prueba.model.table.Prices;

@ExtendWith(MockitoExtension.class)
public class ResposeMappingTest {
	
	@Mock
	private  ResposeMapping mapping;
	
	@Test
	void PricesList() {
		List<Prices> filter = new ArrayList<>();
		Prices  prices = null;
		filter.add(prices);
		Assertions.assertNotNull(mapping.mappingPrices(filter));
	}
	
	

}
