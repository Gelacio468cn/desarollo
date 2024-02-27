package com.h2.prueba.mapping;

import java.util.ArrayList;
import java.util.List;

import com.h2.prueba.model.response.PricesResponse;
import com.h2.prueba.model.response.Response;
import com.h2.prueba.model.table.Prices;

public class ResposeMapping {

	public static PricesResponse mappingPrices(List<Prices> filter) {
		
		PricesResponse response = new PricesResponse();
		List<Response>  list = new ArrayList<>();
		Response  r = new Response();
		
		for (Prices fill : filter) {
			if(fill != null) {
				r.setBrandId(fill.getBrandId());
				r.setPrice(fill.getPrice());
				r.setEndDate(fill.getEndDate());
				r.setPriceList(fill.getPriceList());
				r.setProductId(fill.getProductId());
				r.setStartDate(fill.getStartDate());
				list.add(r);
			}
		}
		response.setData(list);
		return response;
	}
}
