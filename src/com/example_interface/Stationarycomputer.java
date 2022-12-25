package com.example_interface;

public class Stationarycomputer extends laptop implements Computerapplivation{

	public Stationarycomputer() {
		this.setclassName();
	
	}
	public String getclassName () {
    	return className;
    }
    public void setclassName() {
    	this.className = "Stationarycomputer";
	 }
}