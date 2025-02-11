package com.celcom.day6;


class MainClass{
	
}
public class ObjectHashCode {

	public static void main(String[] args) {
		MainClass one = new MainClass();
		System.out.println(one.hashCode());
		MainClass two = one;
		System.out.println(one.hashCode());
	}
}