package com.dataJpa.modal;

public class Pen {
	
	
	private int Pid;
	private int pprice;
	private String pname;
	private String pcolour;
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcolour() {
		return pcolour;
	}
	public void setPcolour(String pcolour) {
		this.pcolour = pcolour;
	}
	public Pen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pen(int pid, int pprice, String pname, String pcolour) {
		super();
		this .Pid = pid;
		this.pprice = pprice;
		this.pname = pname;
		this.pcolour = pcolour;
	}
	@Override
	public String toString() {
		return "Pen [Pid=" + Pid + ", pprice=" + pprice + ", pname=" + pname + ", pcolour=" + pcolour + "]";
	}
	
	
	

}
