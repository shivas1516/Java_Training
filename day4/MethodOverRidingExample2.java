package com.celcom.day4;

class Animal {
	
	void move() {
		System.out.println("Can't be Defined");
	}
	
	void eatFoodType() {
		System.out.println("Can,t be Defined");
	}
	
}

class Pig extends Animal {
	
	void move() {
		System.out.println("Pig will move by walk");
	}
	
	void eatFoodType() {
		System.out.println("Pig will eat Mud");
	}
	
}

class Sparrow extends Animal {
	
	void move() {
		System.out.println("Sparrow will move by Fly");
	}
	
	void eatFoodType() {
		System.out.println("Sparrow will eat Grains");
	}
	
}

class Monkey extends Animal {
	
	void move() {
		System.out.println("Monkey will move by walk");
	}
	
	void eatFoodType() {
		System.out.println("Monkey will eat Rice with Sambar and Biriyani with Chicken 65");
	}
	
}

public class MethodOverRidingExample2 {
	
	public static void main(String args[]) {
		Animal animal;
		
		animal = new Pig();
		animal.move();
		animal.eatFoodType();
		
		animal = new Monkey();
		animal.move();
		animal.eatFoodType();
		
		animal = new Sparrow();
		animal.move();
		animal.eatFoodType();
	}
	
}