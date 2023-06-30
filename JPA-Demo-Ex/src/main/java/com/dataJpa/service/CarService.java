package com.dataJpa.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dataJpa.modal.Car;
import com.dataJpa.repo.CarRepo;

public class CarService {
	
	@Autowired
   CarRepo cRepo;
   
  public Car vasu(Car cb){
	  
	  Car c1=cRepo.save(cb);
			  return c1;
	    
   }
}
