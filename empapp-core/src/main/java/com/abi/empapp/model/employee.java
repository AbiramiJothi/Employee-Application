package com.abi.empapp.model;

public class employee {
	@Override
	public String toString() {
		return "employee [ID=" + ID + ", NAME=" + NAME + ", DESIGATION=" + DESIGATION + "]";
	}
	private Integer ID;
	private String NAME;
	private String DESIGATION;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getDESIGATION() {
		return DESIGATION;
	}
	public void setDESIGATION(String dESIGATION) {
		DESIGATION = dESIGATION;
	}
	
	

}
