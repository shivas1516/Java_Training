package com.celcom.day2;

class Fruits{
	
	//Variable Declaration
	String name;
	int Weight;
	String colour;
	
	//Constructor
	Fruits(String name, int Weight, String colour){
		this.name = name;
		this.Weight = Weight;
		this.colour = colour;
	}
	
	//Display method
	void show() {
		System.out.println("Fruit Name: " + name);
		System.out.println("Fruit Weight in grams: " + Weight);
		System.out.println("Fruit Colour: " + colour);
	}
	
	//Setter Method
	void setweight(int Weight) {
		this.Weight = Weight;
	}
}

public class ClassAndObject2 {

	public static void main(String[] args) {
		Fruits obj = new Fruits("Apple", 100, "Red");
		obj.show();
		
		obj.setweight(300);
		obj.show();
	}

}
