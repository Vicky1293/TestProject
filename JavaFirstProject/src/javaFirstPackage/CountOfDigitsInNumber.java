package javaFirstPackage;

import java.util.Scanner;
// To Check How Many Digits In Given number e.g- Number-1293, Digits- 4
public class CountOfDigitsInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int count=0;
		while(num!=0) {
			num= num/10;
			count++;
		}
			
		
		System.out.println("Given Number has"+" "+count+" "+"digits");
	}

}
