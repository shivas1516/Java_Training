package com.celcom.day1;

public class CommentArgument2 {
		public static void main(String[] args) {
			
			if (args.length == 2) {
				System.out.println("Length of Args Array is: " + args.length);
				System.out.println("Argument 1: " + args[0]);
				System.out.println("Argument 2: " + args[1]);
				System.out.println("Sum is: " + (args[1] + args[0]));
			}else {
				System.out.println("Insufficent Data");
			}
			//System.out.println("Argument 3: " + args[2]);
		}

	}
