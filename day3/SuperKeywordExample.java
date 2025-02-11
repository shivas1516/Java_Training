package com.celcom.day3;
class Cake {
	String name;
	Cake(String name) {
		this.name = name;
		System.out.println("The Best Cake (Super Class)");
	}
	void display() {
		System.out.println("The Name is " + name);
	}
}

class EggLess extends Cake{
	EggLess() {
		super("Vennila");
	}
	void show() {
		super.display();
		System.out.println("It is Eggless");
		System.out.println(super.name);
	}
}

class Egg extends Cake {
	Egg() {
		super("Chocolate");
	}
	void show() {
		super.display();
		System.out.println("It is Eggless");
		System.out.println(super.name);
	}
}
//multilevel inheritance example of creating object.
class y extends Egg {
	y() {
		super();
	}
}
public class SuperKeywordExample {
	public static void main(String args[]) {
		EggLess obj = new EggLess();
		obj.show();
		Egg obj2 = new Egg();
		obj2.show();
		y obj3 = new y();
	}
}
