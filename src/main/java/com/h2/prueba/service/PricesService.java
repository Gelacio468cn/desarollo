package com.h2.prueba.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h2.prueba.mapping.ResposeMapping;
import com.h2.prueba.model.response.PricesResponse;
import com.h2.prueba.model.table.Prices;
import com.h2.prueba.utils.ConversorFechas;
import com.speedment.jpastreamer.application.JPAStreamer;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PricesService {

	
    private final JPAStreamer jpaStreamer;

	public PricesResponse  pricesService(String hora, String fecha, String idProduct) {
		
		String fechaUpdate = ConversorFechas.cadena(hora,fecha);
		
		List<Prices>  prices = jpaStreamer.stream(Prices.class)
			                   .filter(p -> p.getStartDate().equals(fechaUpdate))
	                           .filter(p -> p.getProductId().equals(idProduct))
                               .collect(Collectors.toList());

		PricesResponse  response = ResposeMapping.mappingPrices(prices);
		return response;
	}
	
	
	
}
