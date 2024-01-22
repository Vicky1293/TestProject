package javaFirstPackage;

import java.util.HashMap;
import java.util.Scanner;
// Find Duplicate Characters In String
public class DupCharInStr {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String To Find Duplicate Character: ");
		String str= sc.nextLine();
		char ch[]= str.toLowerCase().toCharArray();
		HashMap<Character, Integer> m= new HashMap<>();
		for(char c:ch) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			}else {
				m.put(c,1);
			}
		}
		for(char c: m.keySet()) {
			if(m.get(c)>1) {
				System.out.println("character "+c+' ' + "Repeated "+m.get(c)+' '+ "Times");
			}
		}

	}

}
