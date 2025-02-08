package com.celcom.day4;
import java.util.Scanner;
public class PronicNumber {

	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    if(n % 2 != 0) {
	    	System.out.println("Not Pronic");
	    	System.exit(0);
	    }
	    int flag = 0;
	    for(int i = 1; i <= Math.sqrt(n); i++) {
	    	if((i * (i + 1)) == n)  {
	    		System.out.print("pronic");
	    		flag = 1;
	    		break;
	    	}
	    }
	    if(flag == 0) System.out.println("Not Pronic");
	}
}
