package com.h2.prueba.model.response;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class PricesResponse  implements Serializable {
	private static final long serialVersionUID = 1845543142728736211L;
	private List<Response> data;
}
