package com.h2.prueba.model.response;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Response implements Serializable {
	private static final long serialVersionUID = 1845543142728736211L;
	
	private Long brandId;
	private String productId;
    private Integer priceList;
	private String startDate;
	private String endDate;
	private BigDecimal price;
}
