package corejava_assignment;
import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Prompt the user to enter two numbers
			System.out.println("Enter two numbers:");
			int number1 = scanner.nextInt();
			int number2 = scanner.nextInt();
			// Add the two numbers
			int sum = add(number1, number2);
			System.out.println("The sum of the two numbers is " + sum);
			// Subtract the two numbers
			int difference = subtract(number1, number2);
			System.out.println("The difference of the two numbers is " + difference);
			// Multiply the two numbers
			int product = multiply(number1, number2);
			System.out.println("The product of the two numbers is " + product);
			// Divide the two numbers
			int quotient = divide(number1, number2);
			System.out.println("The quotient of the two numbers is " + quotient);
			// Raise the base number to the exponent
			int power = power(number1, number2);
			System.out.println("The power of the base number to the exponent is " + power);
		}
    }
    public static int add(int number1, int number2) {
        return number1 + number2;
    }
    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }
    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }
    public static int divide(int number1, int number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return number1 / number2;
    }
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}