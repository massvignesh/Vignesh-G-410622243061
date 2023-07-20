package corejava_assignment;

import java.util.Scanner;
public class RecursiveOperations {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			// Factorial Calculation
			System.out.println("Enter a positive integer: ");
			int n = input.nextInt();
			System.out.println("The factorial of " + n + " is " + factorial(n));
			// Fibonacci Series
			System.out.println("Enter the number of terms in the Fibonacci series: ");
			int numTerms = input.nextInt();
			System.out.println("The Fibonacci series up to " + numTerms + " terms is: ");
			for (int i = 0; i < numTerms; i++) {
			    System.out.print(fibonacci(i) + " ");
			}
			// Sum of Digits
			System.out.println("Enter a positive integer: ");
			int num = input.nextInt();
			System.out.println("The sum of the digits of " + num + " is " + sumOfDigits(num));
			// Palindrome Check
			System.out.println("Enter a string: ");
			String str = input.nextLine();
			System.out.println("Is " + str + " a palindrome? " + isPalindrome(str));
			// Tower of Hanoi
			System.out.println("Enter the number of discs: ");
			int numDiscs = input.nextInt();
			towerOfHanoi(numDiscs, 'A', 'B', 'C');
		}
    }
    // Factorial Calculation
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    // Fibonacci Series
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
   }
    // Sum of Digits
    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num % 10 + sumOfDigits(num / 10);
        }
    }
    // Palindrome Check
    public static boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        } else if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        } else {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
    }
    // Tower of Hanoi
    public static void towerOfHanoi(int numDiscs, char fromPeg, char toPeg, char auxPeg) {
        if (numDiscs == 1) {
            System.out.println("Move disk 1 from peg " + fromPeg + " to peg " + toPeg);
        } else {
            towerOfHanoi(numDiscs - 1, fromPeg, auxPeg, toPeg);
            System.out.println("Move disk " + numDiscs + " from peg " + fromPeg + " to peg " + toPeg);
            towerOfHanoi(numDiscs - 1, auxPeg, toPeg, fromPeg);
        }
    }
}