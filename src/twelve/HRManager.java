package twelve;

// Subclass HRManager extends Employee
class HRManager extends Employee {
// Constructor to initialize HRManager with name and salary
public HRManager(String name, double salary) {
super(name, salary);
}
// Overriding the work() method to define HRManager-specific work
@Override
public void work() {
System.out.println(getName() + " is managing HR tasks, like recruitment and employee welfare.");
}
// Adding a new method to add an employee
public void addEmployee(String employeeName) {
System.out.println(getName() + " is adding a new employee: " + employeeName);
}
}