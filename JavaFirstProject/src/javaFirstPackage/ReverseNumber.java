package javaFirstPackage;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number To Reverse: ");
		int num = scanner.nextInt();
		//Approach1- by using while loop and modulo division(%) and division(/)
		int rev = 0;
		while(num!=0) {
			rev=rev*10 + num%10;
			num=num/10;
		}
		// Approach2 - reverse number by using stringbuffer class which having reverse method
		
		/*StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev =sb.reverse();
		System.out.println("Reverse Number is: " + rev);*/
		
		
		// Approach3- by using stringBuilder class having reverse method
		
		/*StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev=sbl.reverse();*/
		System.out.println("Reverse Number is: " + rev);
	}

}
