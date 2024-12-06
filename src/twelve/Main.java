package twelve;
//Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a
//subclass called HRManager that overrides the work() method and adds a new method called
//addEmployee().
public class Main {
public static void main(String[] args) {
// Creating an Employee object
Employee employee = new Employee("John Doe", 50000);
System.out.println(employee.getName() + "'s Salary: " + employee.getSalary());
employee.work(); // Calling work() method from Employee
System.out.println(); // For better readability
// Creating an HRManager object
HRManager hrManager = new HRManager("Alice Smith", 80000);
System.out.println(hrManager.getName() + "'s Salary: " + hrManager.getSalary());
hrManager.work(); // Calling overridden work() method from HRManager
hrManager.addEmployee("Jane Johnson"); // Calling the addEmployee() method
}
}