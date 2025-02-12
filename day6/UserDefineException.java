package com.celcom.day6;

import java.util.Scanner;

// We can create checked Exception by extend the class to Exception, While the Un-checked Exception is created by extending the Runtime Exception
class InvalidAgeException extends Exception {

	private static final long serialVersionUID = 1L;
	int age;

	// Constructor
	InvalidAgeException(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return age + " - Invalid Age for Voting";
	}
}

public class UserDefineException {
	public static void main(String[] args) throws InvalidAgeException {
		System.out.println("Enter Your Name: ");
		int age = new Scanner(System.in).nextInt();

		if (age > 18) {
			System.out.println("Welcome to Vote");
		} else {
			throw new InvalidAgeException(age);
		}
	}

}
