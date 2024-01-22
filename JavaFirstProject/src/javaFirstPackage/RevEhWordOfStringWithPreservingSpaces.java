package javaFirstPackage;

public class RevEhWordOfStringWithPreservingSpaces {
//write a java program to reverse a given string with preserving the position of spaces
	public static void main(String[] args) {
		String s = "Hello World";
		String words[]=s.split(" ");
		String reversstring="";
		
		for(String w:words) {
			String reverseword="";
			
			
			for(int i=w.length()-1;i>=0;i--) {
				reverseword+=w.charAt(i);
			}
			reversstring+=reverseword + " ";
		}
		System.out.println(reversstring);

	}

}
