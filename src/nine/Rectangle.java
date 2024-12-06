package nine;

// Rectangle class that implements Shape
class Rectangle implements Shape {
private double length;
private double width;
// Constructor to initialize length and width
public Rectangle(double length, double width) {
this.length = length;
this.width = width; }
// Implement getArea() method for Rectangle
@Override
public double getArea() {
return length * width; }}