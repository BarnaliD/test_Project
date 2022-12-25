package com.example_interface;

public class Main {

	public static void main(String[] args) {
		Computer myobj = new Computer();
		myobj. turnOn();
		myobj.playMusic();
		myobj.download();
		myobj.turnOff();
		laptop l = new laptop();
		l.turnOn();
		l.changeBrowser();
		l.upload();
		l.playVideo();
		l.turnOff();
		Stationarycomputer sc = new Stationarycomputer();
		sc.turnOn();
		sc.playMusic();
		sc.playVideo();
		sc.turnOff();
	}

}
