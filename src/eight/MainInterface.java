package eight;
//Write a Java program to create a Animal interface with a method called bark() that takes no arguments and
//returns void. Create a Dog class that implements Animal and overrides speak() to print "Dog is barking".
public class MainInterface {
public static void main(String[] args) {
// Create an instance of Dog
Animal myDog = new Dog();
// Call the bark method
myDog.bark();
}
}