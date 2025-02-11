package com.celcom.day5;

public class Dog {
	
	String name, breed;
	Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	void setName(String name) {
		this.name = name;
	}
	void setBreed(String breed) {
		this.breed = breed;
	}
	void display() {
		System.out.println("The Name is " + name);
		System.out.println("The Breed is " + breed);
	}
	public static void main(String arg[]) {
		Dog dog = new Dog("Pomeranian", "Cross Breed");
		dog.display();
		dog.setName("Pug");
		dog.setBreed("Natural");
		dog.display();
	}
	
}
