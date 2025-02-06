package com.celcom.day3;

public class car {
	
	//Variable Declaration
	String Brand;
	String Model;
	int Mileage;
	double Price;
	
	//Constructor
	car(String Brand, String Model, int Mileage, double Price){
		this.Brand = Brand;
		this.Model = Model;
		this.Mileage = Mileage;
		this.Price = Price;
	}
	
	//Display method
	void show() {
		System.out.println("The Car Brand is: " + Brand);
		System.out.println("The Car Model is: " + Model);
		System.out.println("The Car Gives " + Mileage + "/Liter");
		System.out.println("Price of the Car: " + Price);
		
	}

	public static void main(String[] args) {
		car Toyota = new car("Toyota", "Fortuner", 17, 2800000);
		Toyota.show();
	}

}
