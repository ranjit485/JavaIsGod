package four;
//Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and
//a method to calculate years of service.
import java.time.LocalDate;
import java.time.Period;
public class Employee {
// Attributes for name, salary, and hire date
private String name;
private double salary;
private LocalDate hireDate;
// Constructor to initialize the employee attributes
public Employee(String name, double salary, LocalDate hireDate) {
this.name = name;
this.salary = salary;
this.hireDate = hireDate; }
// Getter and Setter for Name
public String getName() {
return name;}
public void setName(String name) {
this.name = name;}
// Getter and Setter for Salary
public double getSalary() {
return salary; }
public void setSalary(double salary) {
this.salary = salary; }
// Getter and Setter for Hire Date
public LocalDate getHireDate() {
return hireDate; }
public void setHireDate(LocalDate hireDate) {
this.hireDate = hireDate; }
// Method to calculate the years of service
public int calculateYearsOfService() {
LocalDate currentDate = LocalDate.now(); // Get the current date
Period period = Period.between(hireDate, currentDate); // Calculate the period between hire date and current date
return period.getYears(); // Return the number of years
}
public static void main(String[] args) {
// Create an Employee object with name, salary, and hire date
Employee employee = new Employee("John Doe", 55000, LocalDate.of(2015, 6, 15));
// Display employee details
System.out.println("Employee Name: " + employee.getName());
System.out.println("Salary: $" + employee.getSalary());
System.out.println("Hire Date: " + employee.getHireDate());
// Calculate and display the years of service
System.out.println("Years of Service: " + employee.calculateYearsOfService());
}
}