package javaFirstPackage;

public class TwoNumbersMaxProduct {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int a=arr[0];
		int b=arr[1];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]*arr[j]>a*b) {
					a=arr[i];
					b=arr[j];
				}
			}
		}
		System.out.println(a+" and "+b +" having maximum product in given array");

	}

}
