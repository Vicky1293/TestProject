package javaFirstPackage;

import java.util.Arrays;

public class SecondHighestNum {

	public static void main(String[] args) {
		//Approach 1st- This approach will not work if two elements are same
		/*int num[]= {7,8,5,4,6,55,3,-1,55};
		int n= num.length;
		int max=0;
		Arrays.sort(num);
		System.out.println("Second Highest Number is: " + num[n-2]);*/
		
		//Approach 2nd
		/*int num[]= {7,8,5,4,8,6,55,3,-1,55};
		int n= num.length;
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int i=0; i<n;i++) {
			if(num[i]>largest) {
				second=largest;
				largest=num[i];
				
			}else if(num[i]>second && num[i]!=largest) {
				second=num[i];
			}
			
		}
		
		System.out.println("Second highest number in array is: "+second);*/
		
		//Approach3-instead of for(int i=0; i<n;i++) we use for(int number: num) which will work same
		int num[]= {5,7,9,7,9,44,45,5,105,107,107};
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int number: num) {
			if(number>largest) {
				second=largest;
				largest=number;
			}else if(number>second && number!=largest) {
				second=number;
			}
		}
		System.out.println("Second Highest Number In Array is: "+second);
	}
}
