package com.dataJpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataJpa.modal.Employe;
import com.dataJpa.repo.Employerepo;

@Service
public class Employeservice {
	
	@Autowired
	Employerepo Erepo;
	// insert one record
	public Employe vasu (Employe Eb) 
	{
		
		Employe E1=Erepo.save(Eb);
		
		  return E1;
		
	}
	// insert multiple reacords
	public List<Employe> insertData(List<Employe>Ex){
		List<Employe> Ev =Erepo.saveAll(Ex);
		
		   return Ev;
		
	}
	
	// select Data
	public List<Employe> employegetData(){
		
		return Erepo.findAll();
		
	}
	
	
	// update the Data
	public Employe updataEmployedata(Integer eid ,Employe E1) {
		
		Employe E2=Erepo.findById(eid).get();
		
//		        E2.setEid(E1.getEid());
		        E2.setEname(E1.getEname());
		        E2.setEloc(E1.getEloc());
		        E2.setEsal(E1.getEsal());
		        
		           return Erepo.save(E2); 
		                
	}
	
	// delete the data
	public String deleteEmployeData(Integer eid)
	{
		Erepo.deleteById(eid);
		return "";
	}
	
}


