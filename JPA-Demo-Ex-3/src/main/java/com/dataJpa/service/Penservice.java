package com.dataJpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataJpa.modal.Pen;
import com.dataJpa.repo.Penrepo;


@Service
public class Penservice {
	@Autowired
	Penrepo prepo;
	
	
	// insert data(post)
	public Pen vasu(Pen pn) {
		
		Pen p1 =prepo.save(pn);
		return p1;
	}
	
	// insert multiple records,
	public List<Pen> insertPenData(List<Pen> pn)
	{
		List<Pen> lt = prepo.saveAll(pn);
				return lt;
	}
	
	// select or getting the data (Get)
	public List<Pen> getPenData()
	{
		return prepo.findAll();
	}
	
	// update the data.,(put)
	public Pen updatePenData(Integer pid, Pen pn)
	{
//		Optional<Pen> p1 = prepo.findById(pid);
		Pen p1 = prepo.findById(pid).get();
				p1.setPname(pn.getPname());
				p1.setPcolour(pn.getPcolour());
				p1.setPprice(pn.getPprice());
				
				return prepo.save(p1);
			
	}
	
	// delete
	public String deletePenData(Integer pid)
	{
//		prepo.deleteById(pid);
		prepo.deleteById(pid);
		return " ";
	}

}
