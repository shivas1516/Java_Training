package com.celcom.day3;

public class ThisKeyWord2 {
	
	ThisKeyWord2(){
		this(3);
	}
	
	ThisKeyWord2(int day){
		this("shiva");
		System.out.println("This is Your Day " + day );
	}
	
	ThisKeyWord2(String name){
		System.out.println("Hey! " + name);
	}

	public static void main(String[] args) {
		ThisKeyWord2 obj = new ThisKeyWord2();
	}
}
