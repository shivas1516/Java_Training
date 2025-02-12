package com.celcom.SaturdayAssingment1;
class Vehicle {
	void drive() {
		
	}
}
class Car extends Vehicle{
	void drive() {
		System.out.println("Repairing a Car");
	}
}
public class InheritanceExample2{
	public static void main(String args[]) {
		Vehicle car = new Car();
		car.drive();
	}
}
