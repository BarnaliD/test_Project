package com.example_interface;

public class laptop extends Computer implements Computerapplivation {

	public laptop() {
		this.setclassName ();
	}
	public String getclassName () {
    	return className;
    }
    public void setclassName() {
    	this.className = "laptop";
	
	}
}	


