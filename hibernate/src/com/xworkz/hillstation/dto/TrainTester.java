package com.xworkz.hillstation.dto;

public class TrainTester {

	public static void main(String[] args){
		
		Train train = new Train();
		//upadting
		train.setName("kacheguda SF Express");
		train.setDestination("kakinada");
		train.setStartingpoint("benguluru");
		train.setPrice(1000);
		train.setNoOfSeatsAvilable(30);
		
		System.out.println(train);
		
	}
}
