package com.celcom.day6;

import java.util.Scanner;
class NoVowelException extends Exception{
	public String toString() {
		return "No vowels present in a string";
	}
}
public class Assignment2 {

	static void checkVowels(String word) {
		boolean flag = false;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)=='a' ||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u') {
				flag = true;
				break;
			}
		}
		try {
		if(flag == false) {
			throw new NoVowelException();
		}
		else {
			System.out.println("The word contain vowels");
		}
	}
		catch(NoVowelException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String : ");
		checkVowels(in.next().toLowerCase());

	}

}