package com.celcom.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class KeyWordFinal1 {
	
	static void m1()  throws FileNotFoundException {
		//Checked Exception
		FileReader obj = new FileReader("exmaple.txt");
	}
	
	static void m2() {
		try {
			m1();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		try {
			int a = 10 / 0; // ---> This is Un-checked exception(Not recognition in compile time)
			System.out.println("No Exception");
		} catch (ArithmeticException e) {
			System.out.println("The Error is: " + e);
		} catch (NumberFormatException e) {
			System.out.println("The Error is: " + e);
		} finally {
			System.out.println("Check the Input");
		}
		
		throw new ArithmeticException();
	}

}
