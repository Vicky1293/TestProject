package javaFirstPackage;

public class FindSubString {

	public static void main(String[] args) {
		String str = "Hello, world!";
        String substr = "world";

        boolean found = findSubstring(str, substr);

        if (found) {
            System.out.println("Substring found.");
        } else {
            System.out.println("Substring not found.");
        }
    }

    public static boolean findSubstring(String main, String sub) {
		return main.matches("(.*)" +sub+ "(.*)");
    	
        
    }
}
		


