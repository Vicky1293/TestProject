package javaFirstPackage;

import java.util.Scanner;
//Given an integer, N , print its first 10  multiples. Each multiple N*i  
//(where 1 < i < 10 ) should be printed on a new line in the form: N x i = result.

public class PrintMultiples {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }

        scanner.close();
    }
}


