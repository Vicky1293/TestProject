package javaFirstPackage;

public class MaxAndMinNumberInArray {

	public static void main(String[] args) {
		int a[]= {50,60,-100,101,4};
		int max=a[0];
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				
			}else if(a[i]<min) {
				min=a[i];
				
			}
		}
		System.out.println("max number in array is: "+ max);
		System.out.println("min number in array is: "+ min);
	}

}
