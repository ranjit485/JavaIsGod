package eleven;
//Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers
//        are positive.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberFileProcessor {
// Method to read numbers from a file and throw an exception if any number is positive
public static void checkNumbersInFile(String fileName) throws PositiveNumberException {
try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
String line;
while ((line = reader.readLine()) != null) {
// Convert the line to an integer
int number = Integer.parseInt(line.trim());
// Check if the number is positive
if (number > 0) {
throw new PositiveNumberException("Found a positive number: " + number);
}
}
System.out.println("No positive numbers found in the file.");
} catch (IOException e) {
System.out.println("Error reading the file: " + e.getMessage());
} catch (NumberFormatException e) {
System.out.println("Invalid number format in the file.");
}
}
public static void main(String[] args) {
String fileName = "numbers.txt"; // Specify the path to your input file
try {
checkNumbersInFile(fileName);
} catch (PositiveNumberException e) {
System.out.println(e.getMessage());
}
}
}