package javaFirstPackage;

public class SmallLetters {

	public static void main(String[] args) {
		String s = "Today is my Day";
        StringBuilder smallLetters = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                smallLetters.append(ch);
            }
        }

        System.out.println("Small letters in the string: " + smallLetters.toString());
	}

}
