package com.dataJpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dataJpa.modal.Bus;
import com.dataJpa.repo.Busrepo;
import com.dataJpa.service.Busservice;


@RestController
public class Buscontroll {
	@Autowired
	Busservice bSer;
	
	@PostMapping("/insertData")
	public Bus insertData (@RequestBody Bus Bm) {
		
		Bus Bn =bSer.vasu(Bm);
		
		return Bn;
		
	}

}
