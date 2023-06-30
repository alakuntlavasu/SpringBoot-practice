package com.dataJpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dataJpa.modal.Car;
import com.dataJpa.repo.CarRepo;

@RestController
public class CarControll {
	@Autowired
	CarRepo cRepo;
	
	@PostMapping("/insertCarData")
	public  Car insertCarData(@RequestBody Car c1 ) {
		
		Car cb=cRepo.save(c1);
				
				return cb;
	}

}
