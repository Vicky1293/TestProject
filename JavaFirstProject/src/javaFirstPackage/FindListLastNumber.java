package javaFirstPackage;

public class FindListLastNumber {

	public static void main(String[] args) {
int a[] = {5, 6, 8, 5};
        
        if (a.length > 0) {
            int lastNumber = a[a.length - 1];
            System.out.println("Last number in the list: " + lastNumber);
        } else {
            System.out.println("The list is empty.");
        }

	}

}
