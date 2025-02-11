package com.celcom.day1;

import java.util.Scanner;

public class FactorialTable {
	public static void main(String[] args) {
	        Scanner ref_var = new Scanner(System.in);

	            System.out.print("Enter a number to calculate its factorial: ");
	            int num = ref_var.nextInt();
	            long factorial = 1;

            for (int i = 1; i <= num; i++) {
            	
                for (int j = 1; j <= i; j++) {
                    factorial *= j;
                }
                System.out.println("The factorial of " + i + " is: " + factorial);
            }
	    }
	}