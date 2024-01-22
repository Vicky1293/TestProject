package javaFirstPackage;

import java.util.Scanner;
// To Check How Many Words In Given String
public class CountOfWord {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = sc.nextLine();
		int count=1;
		for(int i=0; i<s.length()-1; i++) {
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
				count++;
			}
			
		}
		System.out.println("Number of Word in a String: "+ count);
	}
}
