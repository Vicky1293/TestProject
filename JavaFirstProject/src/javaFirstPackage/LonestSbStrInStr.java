package javaFirstPackage;

import java.util.HashMap;
import java.util.Map;

public class LonestSbStrInStr {
    //Approach 1st
	public static void main(String[] args) {
		String input= "vikramsayajikatkar";
		Map<Character, Integer> visited = new HashMap<>();
		String output=" ";
		for(int start=0,end=0; end<input.length(); end++) {
			char currChar=input.charAt(end);
			if(visited.containsKey(currChar)) {
				start= Math.max(visited.get(currChar)+1,start);
			}
			if(output.length()<end-start + 1) {
				output=input.substring(start,end + 1);
			}
			visited.put(currChar, end);
		}
		System.out.println(output);
		
	}

}
