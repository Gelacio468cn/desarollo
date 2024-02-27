package com.h2.prueba.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.h2.prueba.model.response.PricesResponse;
import com.h2.prueba.service.PricesService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/prices")
@RequiredArgsConstructor
public class PricesController {

    private final PricesService service;

    @GetMapping("/prueba/{idProduct}")
    public ResponseEntity<PricesResponse> pricesList(@PathVariable String idProduct,
    		                                        @RequestParam(value = "hora", required = false) String hora,
    		                                        @RequestParam(value = "fecha", required = false) String fecha) {
    	
        return ResponseEntity.ok(service.pricesService(hora,fecha,idProduct));
    }
}
