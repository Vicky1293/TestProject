package javaFirstPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingCharInStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter str to check first non-repeating char: ");
		String str= sc.nextLine().toLowerCase();
		sc.close();
		Map<Character, Integer> map= new HashMap<>();
		boolean status=false;
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			if(map.get(ch)==null) {
				map.put(ch, 1);
			}else {
				map.put(ch, map.get(ch)+1);
			}
	
		}
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			if(map.get(ch)==1) {
				System.out.println("First non-repeating char in given str is: " +ch);
				status=true;
				break;
			}
		}
		if(!status) {
			System.out.println("There is no any unique char in given str");
		}
		

	}

}
