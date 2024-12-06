package one;
//Write a Java program to find the maximum and minimum value of an array.
import java.util.Scanner;
public class MaxMinArrayUserInput {
    public static void main(String[] args) {
// Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
// Ask the user to enter the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
// Declare the array
        int[] array = new int[size];
// Ask the user to enter the elements of the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
// Call the method to find the maximum and minimum values
        int[] result = findMaxMin(array);
// Display the results
        System.out.println("Maximum value: " + result[0]);
        System.out.println("Minimum value: " + result[1]);
// Close the scanner
        scanner.close();
    }
    // Method to find the maximum and minimum values in an array
    public static int[] findMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];
// Loop through the array to find max and min
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
// Return the results as an array
        return new int[]{max, min};
    }
}