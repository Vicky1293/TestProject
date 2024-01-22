package javaFirstPackage;

public class ReverseStringWithoutPreservingSpaces {
//write a java program to reverse a given string without preserving the position of spaces
	public static void main(String[] args) {
		String s="Hello World";
		
		char ch[]= s.toCharArray();
		String reverseString="";
		for(int i= ch.length-1;i>=0;i--) {
			reverseString+=ch[i];
		}
		System.out.println(reverseString.toString());
	}

}
