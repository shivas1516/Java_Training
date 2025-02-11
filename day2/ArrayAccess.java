package com.celcom.day2;

public class ArrayAccess {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		System.out.println("Array Length :" + arr.length);
		System.out.println("Array Elemnts are");
		
		for (int index = 0; index < arr.length; index++) {
			System.out.println(arr[index]);
		}
		
		/*for (int value : arr) {
			System.out.println(value); ---> It is linear and forward direction only
		}*/
	}

}