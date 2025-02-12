package com.celcom.day6;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		System.out.println("Before Exception");

		// We can define multiple catch block in a try block, And only one matching
		// catch case be executed

		try { // Try can come with either catch or final, and can't come only
			int a = 10 / 0;
			System.out.println("No Exception"); // This print statement only executed only if no exception happen, if
												// the exception occurs it then start seek for respective catch
		} catch (ArithmeticException e) {
			System.out.println("The Error is: " + e);
		} catch (NumberFormatException e) {
			System.out.println("The Error is: " + e);
		}

		System.out.println("After Exception");

		// The catch should be Sub Type to Super Type, if not so, then it throw compile
		// time error
		try {
			int arr[] = { 10, 20, 30 };
			System.out.println(arr[3]);
		} catch (ArithmeticException e) {
			System.out.println("The Error is: " + e);
		} catch (NumberFormatException e) {
			System.out.println("The Error is: " + e);
		} catch (Exception e) { // Exception is superclass of all the exception and it can handle all kind of
								// exception. We can also create a catch for error
			System.out.println("Try After Sometime" + "The Error is: " + e);
		}
	}

}