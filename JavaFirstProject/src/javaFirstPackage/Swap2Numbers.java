package javaFirstPackage;

public class Swap2Numbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 50;
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swaping : a = " +a +  " , b = " + b);

	}

}
