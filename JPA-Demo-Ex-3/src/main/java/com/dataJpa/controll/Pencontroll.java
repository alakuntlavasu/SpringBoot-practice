package com.dataJpa.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dataJpa.modal.Pen;
import com.dataJpa.service.Penservice;


@RestController
public class Pencontroll {
	@Autowired
	Penservice pService;
	
	@PostMapping("/insertData")
	public Pen insertData(@RequestBody Pen pm) {
		
		Pen pt=pService.vasu(pm);
		return pt;
	}
	// insert list data.,
		@PostMapping("/insertPenData")
		public List<Pen> insertPenData(@RequestBody List<Pen> pn)
		{
			List<Pen> lt = pService.insertPenData(pn);
					return lt;
		}
		
		// select, getMapping
		@GetMapping("getPenData")
		public List<Pen> getPenData()
		{
			return pService.getPenData();
		}
		
		// putMapping
		@PutMapping("updatePenData/{pid}")
		public Pen updatePenData(@PathVariable Integer pid, @RequestBody Pen pn)
		{
			return pService.updatePenData(pid, pn);
		}
		
		// delete.,
		@DeleteMapping("/vasu/{pid}")
		public String deletePenData(@PathVariable Integer pid)
		{
			pService.deletePenData(pid);
				return "Vasu, deleted the records successfully";
		}

}
