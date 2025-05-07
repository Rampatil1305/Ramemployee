package dev;
public class Employee {
    String name;
    int id;
    double salary;
    String address; // Incorrect type, should be String

    public Employee(String name, int id, double salary,String address) { // Added address parameter
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.address = address; // Corrected to assign address
    }

    public void displayInfo() { // Corrected method name
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Address: " + address); // Added address display
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("xyz", 101, 50000.0,"hubli");
        emp1.displayInfo(); // Updated to match corrected method name
    }
}