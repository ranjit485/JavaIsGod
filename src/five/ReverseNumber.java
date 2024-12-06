package five;

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
// Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
// Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
// Call the method to reverse the number
        int reversedNumber = reverseNumber(number);
// Display the reversed number
        System.out.println("Reversed number: " + reversedNumber);
// Close the scanner
        scanner.close(); }
    // Method to reverse the digits of the number
    public static int reverseNumber(int number) {
        int reversed = 0;
// Loop to reverse the number
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Add the digit to the reversed number
            number = number / 10; // Remove the last digit from the number }
            return reversed; }
        return reversed;
    }}