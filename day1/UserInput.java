package com.celcom.day1;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String name = scan.nextLine();
		
		System.out.println("Hello " + name + "Welcome!");

	}

}
