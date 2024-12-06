package seven;
//Write a Java program to calculate sum of digits of number. Take number from User
import java.util.Scanner;
public class SumOfDigits {
public static void main(String[] args) {
// Create a Scanner object for user input
Scanner scanner = new Scanner(System.in);
// Prompt the user to enter a number
System.out.print("Enter a number: ");
int number = scanner.nextInt();
// Call the method to calculate the sum of digits
int sum = sumOfDigits(number);
// Display the sum of digits
System.out.println("Sum of digits: " + sum);
// Close the scanner
scanner.close();}
// Method to calculate the sum of digits of a number
public static int sumOfDigits(int number) {
int sum = 0;
// Make sure to handle negative numbers by converting to positive
number = Math.abs(number);
// Loop through the number to extract and sum the digits
while (number != 0) {
int digit = number % 10; // Get the last digit
sum += digit; // Add the digit to the sum
number = number / 10; // Remove the last digit from the number}
return sum;}
    return sum;
}}