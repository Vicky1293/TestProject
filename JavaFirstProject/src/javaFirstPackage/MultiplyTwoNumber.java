package javaFirstPackage;


public class MultiplyTwoNumber {
	
	
	public static int multi(int a, int b) {
		int mul=0;
		for(int i=0; i<b; i++) {
			mul=mul+a;
			
		}
		return mul;
		
		
		
	}
	public static void main(String[] args) {
		System.out.println(multi(5, 2));
	}

}
