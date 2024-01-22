package javaFirstPackage;

public class vikram {

	public static void main(String[] args) {
		int[] inputArray = {-1, 1, 5, 4, 6, -9, 9};

        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] + inputArray[i + 1] == 0) {
                inputArray[i] = 0;
                inputArray[i + 1] = 0;
            }
        }

        // Output the modified array
        System.out.print("Modified array: [");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);
            if (i < inputArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}






