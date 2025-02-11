package com.celcom.day3;
class Vehicle {
	void noOfEngines() {
		System.out.println("I have One Engine");
	}
}
class TwoWheeler extends Vehicle {
	void noOfWheels() {
		System.out.println("I have Two Wheels");
	}
}
class GearBike extends TwoWheeler {
	void brandName(String name) {
		System.out.println("The Brand is " + name);
	}
}
class Scooter extends TwoWheeler {
	void brandName(String name) {
		System.out.println("The Brand is " + name);
	}
}
public class InheritanceExample {
	public static void main(String args[]) {
		TwoWheeler obj1 = new TwoWheeler();
		obj1.noOfEngines();
		obj1.noOfWheels();
		GearBike obj2 = new GearBike();
		obj2.brandName("Yamaha");
		//Using obj2 or obj3 object also we can able to access the functionality of Vehicle and TwoWheeler Class
		System.out.println("------------------Using obj2 Object--------------------");
		obj2.noOfEngines();
		obj2.noOfWheels();
		Scooter obj3 = new Scooter();
		obj3.brandName("Pept");
		
	}
}