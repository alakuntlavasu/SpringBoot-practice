package com.dataJpa.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Book 
{
	@Id
	private int bId;
	private String bName;
	private double bPrice;
	// constructor
	public Book()
	{
		
	}
	// parameterized constructor
//	public Book(int bId, String bName, double bPrice) {
//		super();
//		this.bId = bId;
//		this.bName = bName;
//		this.bPrice = bPrice;
//	}
	
	
	
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
	public double getbPrice() {
		return bPrice;
	}
	public void setbPrice(double bPrice) {
		this.bPrice = bPrice;
	}
	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", bPrice=" + bPrice + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
