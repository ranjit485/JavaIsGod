package twelve;

// Base class Employee
class Employee {
private String name;
private double salary;
// Constructor to initialize Employee
public Employee(String name, double salary) {
this.name = name;
this.salary = salary;}
// Method to perform work (to be overridden in subclasses)
public void work() {
System.out.println(name + " is working.");}
// Method to get salary
public double getSalary() {
return salary; }
// Getter and Setter methods for name and salary
public String getName() {
return name; }
public void setName(String name) {
this.name = name; }
public void setSalary(double salary) {
this.salary = salary; }}