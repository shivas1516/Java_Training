package com.celcom.day7;

// Lambda Expression is only for functional interface(only one method and multiple variables in interface)
interface LambdaExpInterface {
	public void show();
}

//Calculator with Lambda Expression
interface CalaculatorInterface{
	int  Calaculator(int a, int b );
}

public class LambdaExpression {

	public static void main(String[] args) {
		
		// Lambda Expression
		LambdaExpInterface obj1 = () -> System.out.println("Display");
		obj1.show();
		
		// Lambda Expression with calc example
		 CalaculatorInterface calc = (a, b) -> a + b;
		 System.out.println( calc.Calaculator(10, 50));
		 
		 calc = (a,b) -> {
			 return a - b;
		 };
		 System.out.println( calc.Calaculator(10, 50));
		 
		 calc = (a, b) -> a * b;
		 System.out.println( calc.Calaculator(10, 50));

	}

}
