package com.celcom.Saturday_Assignment_8th_Feb_2025;
class Animal {
	void makeSound() {
		
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("The Sound of a Cat is like Meow");
	}
}
public class InheritanceExample1 {
	public static void main(String args[]) {
		Animal cat = new Cat();
		cat.makeSound();
	}
}
