package com.dataJpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dataJpa.modal.Bus;
import com.dataJpa.repo.Busrepo;


@RestController
public class Buscontroll {
	@Autowired
	Busrepo Brepo;
	
	@GetMapping("/insertData")
	public Bus insertData (@RequestBody Bus Bm) {
		
		Bus Bn =Brepo.save(Bm);
		
		return Bn;
		
	}

}
