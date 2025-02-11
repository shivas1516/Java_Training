package com.celcom.day6;



public class ObjectCloningExample implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException  {
		ObjectCloningExample one = new ObjectCloningExample();
		System.out.println(one.hashCode());
		ObjectCloningExample two = (ObjectCloningExample)one.clone();
		System.out.println(two.hashCode());
	}

}