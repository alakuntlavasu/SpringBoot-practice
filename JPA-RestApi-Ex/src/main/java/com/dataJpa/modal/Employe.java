package com.dataJpa.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class Employe {
	@Id
	private int eid;
	private String ename;
	private String eloc;
	private int esal;
	
	// normal constratuor
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
   // parameterized constratuor
	public Employe(int eid, String ename, String eloc, int esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eloc = eloc;
		this.esal = esal;
	}
	
	
   // setter Anad getter methods
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEloc() {
		return eloc;
	}

	public void setEloc(String eloc) {
		this.eloc = eloc;
	}

	public int getEsal() {
		return esal;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}

	// tostring method
	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", ename=" + ename + ", eloc=" + eloc + ", esal=" + esal + "]";
	}


	
	}

	

