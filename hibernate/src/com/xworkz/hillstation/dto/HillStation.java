package com.xworkz.hillstation.dto;

import java.io.Serializable;

public class HillStation implements Serializable{

	private String name;
	private String location;
	private double Altitude;
	private double temp;
	
	HillStation(){
		System.out.println("going to hillstation");
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public double getAltitude() {
		return Altitude;
	}

	public double getTemp() {
		return temp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setAltitude(double altitude) {
		Altitude = altitude;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return "HillStation [name=" + name + ", location=" + location + ", Altitude=" + Altitude + ", temp=" + temp
				+ "]";
	}
	
}
