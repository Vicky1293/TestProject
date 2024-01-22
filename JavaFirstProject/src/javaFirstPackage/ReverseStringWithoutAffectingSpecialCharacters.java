package javaFirstPackage;
public class ReverseStringWithoutAffectingSpecialCharacters {
    public static void main(String[] args) {
        String input = "vikram@#katkar%$";
        String reversed = reverseStringWithSpecialCharacters(input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseStringWithSpecialCharacters(String input) {
        char[] characters = input.toCharArray();
        int i = 0;
        int j = characters.length - 1;

        while (i < j) {
            if (!Character.isLetter(characters[i])) {
                i++;
            } else if (!Character.isLetter(characters[j])) {
                j--;
            } else {
                // Swap alphabetic characters
                char temp = characters[i];
                characters[i] = characters[j];
                characters[j] = temp;
                i++;
                j--;
            }
        }
        return new String(characters);
    }
}