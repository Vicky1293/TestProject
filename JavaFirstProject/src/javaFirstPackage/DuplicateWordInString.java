package javaFirstPackage;

import java.util.HashMap;
// Find Duplicate Words In Given String
public class DuplicateWordInString {

	public static void main(String[] args) {
		String s = "Java is very easy but my brain is not supporting java";
		String strings[]= s.toLowerCase().split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for(String word:strings) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			}else {
				map.put(word, 1);
			}
		}
		for(String key:map.keySet()) {
			if(map.get(key)>1) {
				System.out.println(key +" " + map.get(key));
			}
		}
	}

}
