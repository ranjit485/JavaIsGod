package ten;
//Write a Java program to create a method that takes an integer as a parameter and throws an exception if
//the number is odd.
public class OddNumberChecker {
// Method to check if a number is odd and throw an exception
public static void checkEvenNumber(int number) throws OddNumberException {
if (number % 2 != 0) { // Check if the number is odd
throw new OddNumberException("The number " + number + " is odd. Exception thrown.");
} else {
System.out.println("The number " + number + " is even.");
}
}public static void main(String[] args) {
        try {
// Test with an even number
            checkEvenNumber(4);
// Test with an odd number
            checkEvenNumber(5);
        } catch (OddNumberException e) {
// Catch and print the exception message
            System.out.println(e.getMessage());
        }
    }
}