package nine;

// Triangle class that implements Shape
class Triangle implements Shape {
private double base;
private double height;
// Constructor to initialize base and height
public Triangle(double base, double height) {
this.base = base;
this.height = height;}
// Implement getArea() method for Triangle
@Override
public double getArea() {
return 0.5 * base * height; // Area of triangle = 1/2 * base * height
 }}