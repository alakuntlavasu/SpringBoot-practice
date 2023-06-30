package com.dataJpa.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dataJpa.modal.Bus;
import com.dataJpa.repo.Busrepo;

public class Busservice 
{
   @Autowired
	Busrepo Brepo;
   
   
   // inset the data
   public Bus vasu (Bus Bt) {
	   
	   Bus b1=Brepo.save(Bt);
	   
	   return b1;
	   
   }
}
