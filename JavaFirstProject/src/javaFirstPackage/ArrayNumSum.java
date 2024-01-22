package javaFirstPackage;

import java.util.Scanner;

public class ArrayNumSum {

	public static void main(String[] args) {
		//Approach 1
		/*int a[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		System.out.print("Sum of array number is:"+sum);*/
		
		//Approach 2nd- avoiding the for loop condition
		
		/*int a[]= {1,2,3,4,5};
		int sum=0;
		for(int v:a) {
			sum+=v;
		}
		System.out.println("sum of array element is: " + sum);*/
		
		//Approach 3rd- by taking input from user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element you want to store: ");
		
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += a[i];
		}
		System.out.println("The sum of the elements in the array is: " + sum);
	}

}
