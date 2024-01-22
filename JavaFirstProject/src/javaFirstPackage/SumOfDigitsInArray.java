package javaFirstPackage;

import java.util.Scanner;

public class SumOfDigitsInArray {

	public static void main(String[] args) {
		//Approach 1st-
		
		/*int number = 12345;
		int sum=0;
		while(number>0) {
			int digit= number%10;
			sum = sum+digit;
			number= number/10;
		}
		System.out.println(sum);*/
		
		//Approach 2nd- by taking input from user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to calculate sum: ");
		int number= sc.nextInt();
		int sum=0,digit=0;
		while(number>0) {
			digit= number%10;
			sum= sum+digit;
			number= number/10;
		}
		
		System.out.println("Sum of number is: " + sum);
		

	}

}
