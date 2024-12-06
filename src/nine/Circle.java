package nine;

// Circle class that implements Shape
class Circle implements Shape {
private double radius;
// Constructor to initialize the radius
public Circle(double radius) {
this.radius = radius; }
// Implement getArea() method for Circle
@Override
public double getArea() {
return Math.PI * radius * radius; // Area of circle = π * r^2
}}