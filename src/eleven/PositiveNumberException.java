package eleven;

// Define a custom exception class
class PositiveNumberException extends Exception {
// Constructor that accepts a custom message
public PositiveNumberException(String message) {
super(message);
}
}