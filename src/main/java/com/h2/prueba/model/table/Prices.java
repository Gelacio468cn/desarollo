package com.h2.prueba.model.table;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@Builder
public class Prices implements Serializable {
	
	private static final long serialVersionUID = 1845543142728736211L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="BRANDID")
	private Long brandId;
	@Column(name="CURRENCY")
	private String currency;
	@Column(name="ENDDATE")
	private String endDate;
	@Column(name="PRICE")
	private BigDecimal price;
	@Column(name="PRICELIST")
	private Integer priceList;
	@Column(name="PRIORITY")
	private Integer priority;
	@Column(name="PRODUCTID")
	private String productId;
	@Column(name="STARTDATE")
	private String startDate;
	
}
