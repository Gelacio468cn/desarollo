package com.h2.prueba.service;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.h2.prueba.model.response.PricesResponse;
import com.h2.prueba.model.table.Prices;
import com.speedment.jpastreamer.application.JPAStreamer;


@ExtendWith(MockitoExtension.class)
class PricesServiceTest {
	private static final String product = "35455";
	private static final String fecha ="2020-06-14";
	private static final String hora ="15.00.00";
	private static final String fecha2 ="2020-06-14";
	private static final String hora2 ="16.00.00";
	private static final String fecha3 ="2020-06-14";
	private static final String hora3 ="21.00.00";
	private static final String fecha4 ="2020-06-15";
	private static final String hora4 ="10.00.00";
	private static final String fecha5 ="2020-06-16";
	private static final String hora5 ="21.00.00";
	private static final String currency ="EUR";
	private static final String endDate ="2020-12-31-23.59.59";
	private static final String startDate = fecha.concat("-").concat(hora);
	private static final String startDate2 =fecha2.concat("-").concat(hora2);
	private static final String startDate3 =fecha3.concat("-").concat(hora3);
	private static final String startDate4 =fecha4.concat("-").concat(hora4);
	private static final String startDate5 =fecha5.concat("-").concat(hora5);
	
	@InjectMocks
	private PricesService service;
	
	@Mock
	private JPAStreamer   jpaStreamer;
	
	private List<Prices> priceList;
	
	@BeforeEach
	public void init() {
		  priceList = Arrays.asList(
				      Prices.builder().brandId(1L).currency(currency).endDate(endDate).price(new BigDecimal(35.5)).priceList(1).priority(0).productId(product).startDate(startDate).build(),
				      Prices.builder().brandId(2L).currency(currency).endDate(endDate).price(new BigDecimal(20.5)).priceList(2).priority(1).productId(product).startDate(startDate2).build(),
				      Prices.builder().brandId(3L).currency(currency).endDate(endDate).price(new BigDecimal(40.5)).priceList(3).priority(1).productId(product).startDate(startDate3).build(),
				      Prices.builder().brandId(4L).currency(currency).endDate(endDate).price(new BigDecimal(50.5)).priceList(4).priority(1).productId(product).startDate(startDate4).build(),
				      Prices.builder().brandId(5L).currency(currency).endDate(endDate).price(new BigDecimal(60.5)).priceList(5).priority(1).productId(product).startDate(startDate5).build()
				  );
	}
	
	@Test
	void PricesServiceListTest() {
        Stream<Prices> list = priceList.stream();
        Mockito.when(jpaStreamer.stream(Prices.class)).thenReturn(list);
		PricesResponse response = service.pricesService(hora,fecha,product);
		Assertions.assertNotNull(response);
	}
	
	@Test
	void PricesServiceListTestCase2() {
        Stream<Prices> list = priceList.stream();
        Mockito.when(jpaStreamer.stream(Prices.class)).thenReturn(list);
		PricesResponse response = service.pricesService(hora2,fecha2,product);
		Assertions.assertNotNull(response);
	}
	
	@Test
	void PricesServiceListTestCase3() {
        Stream<Prices> list = priceList.stream();
        Mockito.when(jpaStreamer.stream(Prices.class)).thenReturn(list);
		PricesResponse response = service.pricesService(hora3,fecha3,product);
		Assertions.assertNotNull(response);
	}
	
	@Test
	void PricesServiceListTestCase4() {
        Stream<Prices> list = priceList.stream();
        Mockito.when(jpaStreamer.stream(Prices.class)).thenReturn(list);
		PricesResponse response = service.pricesService(hora4,fecha4,product);
		Assertions.assertNotNull(response);
	}
	
	@Test
	void PricesServiceListTestCase5() {
        Stream<Prices> list = priceList.stream();
        Mockito.when(jpaStreamer.stream(Prices.class)).thenReturn(list);
		PricesResponse response = service.pricesService(hora5,fecha5,product);
		Assertions.assertNotNull(response);
	}
}
