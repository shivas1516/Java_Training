package com.celcom.day2;
import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int arr [] = {4 ,5,7,82,7,0,5,35,6,578,3};
		Arrays.sort(arr);
		
		for (int i=0; i <arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("Minimum Element of the array is:" + arr[0]);
		System.out.println("Maximum Element of the array is:" + arr[arr.length - 1]);
	}

}
