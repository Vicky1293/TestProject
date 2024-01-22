package javaFirstPackage;

import java.util.Arrays;
import java.util.Scanner;

//Anagram - an anagram of string is another string which contains the same character, only the order
//          of character can be different.
public class CheckingAnagramString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String: ");
		String s1 = sc.nextLine();
		System.out.println("Enter Second String: ");
		String s2 = sc.nextLine();
		s1=s1.replaceAll("\\s", "").toLowerCase();
		s2=s2.replaceAll("\\s", "").toLowerCase();
		
		if(s1.length()==s2.length()) {
			char str1[]=s1.toCharArray();
			char str2[]=s2.toCharArray();
			Arrays.sort(str1);
			Arrays.sort(str2);
			boolean result= Arrays.equals(str1, str2);
			if(result) {
				System.out.println("Strings are anagrams");	
			}else {
				System.out.println("Strings are not anagrams");
			}
		}else {
			System.out.println("Strings are not anagrams");
		}

	}

}
