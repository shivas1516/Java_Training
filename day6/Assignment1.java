package com.celcom.day6;

import java.util.Scanner;

class DuplicateElementException extends Exception {
	int element;

	public DuplicateElementException(int element) {
		this.element = element;
	}

	public String toString() {
		return "duplicate element " + element + " !";
	}
}

public class Assignment1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the array:");
		size = in.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " + size + " elements : ");
		for (int i = 0; i < size; i++) {
			int element = in.nextInt();
			int flag = 1;
			for (int a : arr) {
				try {
					if (a == element) {
						throw new DuplicateElementException(element);
					}
				} catch (DuplicateElementException e) {
					flag = 0;
					System.out.println(e);
					break;
				}
			}
			if (flag == 0) {
				System.out.println("continue with unique value..");
				i--;
			} else {
				arr[i] = element;
			}
		}
		System.out.println("The unique array is :");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}