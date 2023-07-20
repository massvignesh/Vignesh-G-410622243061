package corejava_assignment;
import java.util.Scanner;
public class ArrayOperations {
    public static void main(String[] args) {
        // Create an array of integers with a size of 5.
        int[] array = new int[5];     
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;     
        System.out.println("The elements of the array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }       
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("The sum of all elements in the array is: " + sum);      
        double average = (double) sum / array.length;
        System.out.println("The average value of the elements in the array is: " + average);  
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The maximum value in the array is: " + max);
        System.out.println("The minimum value in the array is: " + min);
        // Sort the elements of the array in ascending order.
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("The sorted array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        try (// Prompt the user to enter a value to search for in the array.
		Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a value to search for in the array: ");
			int value = scanner.nextInt();
			// Implement a search algorithm to find the value in the array.
			int index = -1;
			for (int i = 0; i < array.length; i++) {
			    if (array[i] == value) {
			        index = i;
			        break;
			    }
			}
			// Display the index of the found value, or a message if it is not found.
			if (index != -1) {
			    System.out.println("The value " + value + " was found at index " + index);
			} else {
			    System.out.println("The value " + value + " was not found in the array");
			}
			// Prompt the user to enter an index and a new value.
			System.out.println("Enter an index to update: ");
			int index1 = scanner.nextInt();
			System.out.println("Enter a new value: ");
			int value1 = scanner.nextInt();
			// Update the value at the specified index in the array.
			array[index1] = value1;
		}
        // Display the modified array.
        System.out.println("The modified array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}