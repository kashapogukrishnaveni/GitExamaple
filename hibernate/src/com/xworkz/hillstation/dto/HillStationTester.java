package com.xworkz.hillstation.dto;

public class HillStationTester {

	public static void main (String[] args){
		
		HillStation hillstation = new HillStation();
		
		hillstation.setName("kodaicanal");
		hillstation.setLocation("pallani");
		hillstation.setAltitude(5000);
		hillstation.setTemp(10);
		
		System.out.println(hillstation);
		
	}
}
