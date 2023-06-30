package com.dataJpa.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Bus 
{
	@Id
	private int bId;
	private String bName;
	
	
  // setter And getter methods
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	
	
	// parameterised constractor
	
	public Bus(int bId, String bName) {
		super();
		this.bId = bId;
		this.bName = bName;
	}
	
	// defaut constratuor
	
	public Bus() {
		super();
		
	}
	
	// toString method
	@Override
	public String toString() {
		return "Bus [bId=" + bId + ", bName=" + bName + "]";
	}
	
	
}
