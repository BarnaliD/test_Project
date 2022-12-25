package com.example_interface;

public class Computer implements Computerapplivation{
 
 String className ;
	public Computer() {
		this.setclassName();
	}
    public String getclassName () {
    	return className;
    }
    public void setclassName() {
    	this.className = "Computer";
    	
    }
	@Override
	public void turnOn() {
		System.out.println(getclassName() + " is now turned on");
		
	}
	@Override
	public void turnOff() {
		System.out.println(getclassName() + " is now turned off");
		
		
	}
	@Override
	public void download() {
		System.out.println(getclassName() + "is now performing a dowload");
		
		
	}
	@Override
	public void upload() {
		System.out.println(getclassName() + "is uploading updates");
		
		
	}
	@Override
	public void playMusic() {
		
		System.out.println(getclassName() + "is now playing music");
		
	}
	@Override
	public void changeBrowser() {
		System.out.println(getclassName() + "is now changing browser");
		
		
	}
	@Override
	public void playVideo() {
		System.out.println(getclassName() + "is now playing a video");
				
	}
}
