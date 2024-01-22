package javaFirstPackage;

import java.util.Scanner;

public class MultiplyTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int firstNumber= sc.nextInt();
		System.out.println("Enter second number: ");
		int secondNumber= sc.nextInt();
		
		int mult =0;
		for(int i=0; i<secondNumber; i++) {
			mult=mult+firstNumber;
		}
		System.out.println("Multiplication is: "+mult);

	}

}
