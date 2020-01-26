package com.xworkz.hillstation.dto;

import java.io.Serializable;

public class Train implements Serializable{
	
	private String name;
	private String destination;
	private String startingpoint;
	private int price;
	private int  noOfSeatsAvilable;
	
	Train(){
		System.out.println("Travelling in train");
	}

	public String getName() {
		return name;
	}

	public String getDestination() {
		return destination;
	}

	public String getStartingpoint() {
		return startingpoint;
	}

	public int getPrice() {
		return price;
	}

	public int getNoOfSeatsAvilable() {
		return noOfSeatsAvilable;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setStartingpoint(String startingpoint) {
		this.startingpoint = startingpoint;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setNoOfSeatsAvilable(int noOfSeatsAvilable) {
		this.noOfSeatsAvilable = noOfSeatsAvilable;
	}

	@Override
	public String toString() {
		return "Train [name=" + name + ", destination=" + destination + ", startingpoint=" + startingpoint + ", price="
				+ price + ", noOfSeatsAvilable=" + noOfSeatsAvilable + "]";
	}
	
}
