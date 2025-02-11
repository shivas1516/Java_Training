package com.celcom.day4;

class Vehicle {
	
	void engine() {
		System.out.println("All Vehicle has a Engine");
	}
	void wheels() {
		System.out.println("All Vehicle has a Wheels");
	}
	
}

class Engine {
	
	void engineModel(String vehicleType) {
		if(vehicleType.equals("two wheeler")) {
			System.out.println("It has Two Stroke Engine");
		}
		else if(vehicleType.equals("three wheeler")) {
			System.out.println("It has Three Stroke Engine");
		}
		else if(vehicleType.equals("four wheeler")) {
			System.out.println("It has Four Cylinder Engine");
		}
	}
	
}

class Wheel {
	
	void wheelType() {
		System.out.println("Wheel Company is CEAT");
	}
	void noOfWheels(String vehicleType) {
		if(vehicleType.equals("two wheeler")) {
			System.out.println("It has Two Wheels");
		}
		else if(vehicleType.equals("three wheeler")) {
			System.out.println("It has Three Wheels");
		}
		else if(vehicleType.equals("four wheeler")) {
			System.out.println("It has Four Wheels");
		}
	}
	
}

class Bike extends Vehicle { //Is-A
	
	Wheel wheel = new Wheel(); //HAS-A
	Engine engine = new Engine(); //HAS-A
	
	void engineModel() {
		engine.engineModel("two wheeler");
	}
	void wheelType() {
		wheel.wheelType();
	}
	void noOfWheels() {
		wheel.noOfWheels("two wheeler");
	}
	
}

public class RelationshipInJava {
	
	public static void main(String args[]) {
		Bike bike = new Bike();
		bike.engineModel();
		bike.wheelType();
		bike.noOfWheels();
	}
	
}
