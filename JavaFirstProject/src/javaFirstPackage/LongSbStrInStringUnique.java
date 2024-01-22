package javaFirstPackage;

import java.util.HashSet;
// FIND LONGEST SUBSTRING IN STRING WHICH IS UNOQUE
public class LongSbStrInStringUnique {

	public static void main(String[] args) {
		String s= "Nishi";
		int a_pointer=0;
		int b_pointer=0;
		int max=0;
		HashSet<Character> hash_set= new HashSet<>();
		while(b_pointer<s.length()) {
			if(!hash_set.contains(s.charAt(b_pointer))) {
				hash_set.add(s.charAt(b_pointer));
				b_pointer++;
				max= Math.max(hash_set.size(), max);
			}else {
				hash_set.remove(s.charAt(a_pointer));
				a_pointer++;
			}
		}
		System.out.println(hash_set);
		
           
	}

}
