package com.dataJpa.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dataJpa.modal.Employe;
import com.dataJpa.service.Employeservice;

@RestController
public class Employecontrol {
	
	@Autowired
	Employeservice Ep;
	
	
	
	// single record inserting
	
	@PostMapping("/insertEmployeData") // (Post)http method
	public Employe insertEmployeData(@RequestBody Employe Ec) {
		
		Employe E2=Ep.vasu(Ec);
		return E2;
		
	}
	
	
	// multiple records inserting 
	
	@PostMapping("/insertData") // (post) http method
	public List<Employe> insertData(@RequestBody List<Employe> Em){
		
		List<Employe> Eh=Ep.insertData(Em);
		
		     return Eh;
	}
	
	// geting the data
	
	@GetMapping("/getingdata")// (GET) http method
	public List<Employe> getData()
	{
		return Ep.employegetData();
		
	}
	
	// update the data, @Putmapping
	@PutMapping("/updateEmployeData/{eid}")// (PUT) http method
	public Employe vasu(@PathVariable Integer eid, @RequestBody Employe e)
	{
		return Ep.updataEmployedata(eid, e);
	}
	
	// @DeleteMapping
	@DeleteMapping("/deleteData/{eid}")// (DELETE) http method
	public String deleteEmployeData(@PathVariable Integer eid)
	{
		Ep.deleteEmployeData(eid);
		return "Deleted the value..,";
	}
	
     
     

}
