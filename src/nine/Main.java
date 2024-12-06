package nine;
//Write a Java program to create an interface Shape with the getArea() method. Create three classes
//Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for
//each of the three classes.
public class Main {
public static void main(String[] args) {
// Create instances of Rectangle, Circle, and Triangle
Shape rectangle = new Rectangle(5, 3); // Length = 5, Width = 3
Shape circle = new Circle(4); // Radius = 4
Shape triangle = new Triangle(6, 2); // Base = 6, Height = 2
// Display the area of each shape
System.out.println("Area of Rectangle: " + rectangle.getArea());
System.out.println("Area of Circle: " + circle.getArea());
System.out.println("Area of Triangle: " + triangle.getArea());
}
}