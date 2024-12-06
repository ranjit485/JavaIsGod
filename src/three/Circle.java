package three;
//Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this
//attribute. Calculate the area and circumference of the circle.
public class Circle {
// Attribute (instance variable) to store the radius of the circle
private double radius;
// Constructor to initialize the radius of the circle
public Circle(double radius) {
this.radius = radius;
}
// Getter method to access the radius
public double getRadius() {
return radius;
}
// Setter method to modify the radius
public void setRadius(double radius) {
if (radius > 0) { // Check to ensure that the radius is positive
this.radius = radius;
} else {
System.out.println("Radius must be a positive number.");
}
}
// Method to calculate the area of the circle
public double calculateArea() {
return Math.PI * radius * radius;
}
// Method to calculate the circumference of the circle
public double calculateCircumference() {
return 2 * Math.PI * radius;
}
public static void main(String[] args) {
// Create a Circle object with an initial radius of 5.0
Circle myCircle = new Circle(5.0);
// Display the initial radius, area, and circumference
System.out.println("Radius: " + myCircle.getRadius());
System.out.println("Area: " + myCircle.calculateArea());
System.out.println("Circumference: " + myCircle.calculateCircumference());
// Modify the radius using the setter method
myCircle.setRadius(10.0);
// Display the updated radius, area, and circumference
System.out.println("\nAfter updating the radius:");
System.out.println("Radius: " + myCircle.getRadius());
System.out.println("Area: " + myCircle.calculateArea());
System.out.println("Circumference: " + myCircle.calculateCircumference());
}
}