package com.celcom.day3;

public class ThisKeyWord {
	
	String name;
	
	ThisKeyWord(){
		this("shiva");
	}
	
	void greet(String name) {
		System.out.println("Hey! " + name);
	}
	
	ThisKeyWord(String name){
		this.greet(name);
	}

	public static void main(String[] args) {
		ThisKeyWord obj = new ThisKeyWord();
		
	}

}
