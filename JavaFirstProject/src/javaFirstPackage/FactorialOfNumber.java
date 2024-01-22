package javaFirstPackage;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number To Find Factorial: ");
		int num = scanner.nextInt();
		
		long Factorial = 1;
		
		for(int i=1; i<=num; i++) {
			//these factorial are in ascending order like 5!=1*2*3*4*5=120
			//for  order like 5!=5*4*3*2*1=120 then you have to make change in for loop
			//for(int i=num; i>=1; i--)
			Factorial=Factorial*i;
		}
		System.out.println("Factorial Of " + num +" " +"Is " + Factorial);
		
		scanner.close();

	}

}
