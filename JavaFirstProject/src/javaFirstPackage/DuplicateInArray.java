package javaFirstPackage;

import java.util.HashSet;
import java.util.Set;
// Find Duplicate Numbers In Array
public class DuplicateInArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,3,4,5,6,6,6};
		
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
					break;
					
					
				}
				
			}
			
		}
		
		//Approach 2nd- using set
		Set<Integer> uniqueElements = new HashSet<>();
        System.out.println("Duplicates using a set:");
        for (int element : a) {
            if (!uniqueElements.add(element)) {
                System.out.println(element);
                
            }
        }
		
	}

}
