package com.tns.ifet.activity;
import java.util.Scanner;

//Base class for Employee
class Employee {
 private String name;
 private int age;
 private double salary;

 // Constructor to initialize Employee details
 public Employee(String name, int age, double salary) {
     this.name = name;
     this.age = age;
     this.salary = salary;
 }

 // Getters and setters
 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }

 public double getSalary() {
     return salary;
 }

 public void setSalary(double salary) {
     this.salary = salary;
 }

 // Method to display Employee details
 public void displayEmployeeDetails() {
     System.out.println("Employee Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Salary: $" + salary);
 }
}

//Subclass of Employee for Manager
class Manager extends Employee {
 private String department;

 // Constructor for Manager
 public Manager(String name, int age, double salary, String department) {
     super(name, age, salary);  // Calling the base class constructor
     this.department = department;
 }

 // Getter and setter for department
 public String getDepartment() {
     return department;
 }

 public void setDepartment(String department) {
     this.department = department;
 }

 // Overriding displayEmployeeDetails to include department info
 @Override
 public void displayEmployeeDetails() {
     super.displayEmployeeDetails();  // Call base class method
     System.out.println("Department: " + department);
 }
}

//Custom Exception Class for invalid inputs
class InvalidInputException extends Exception {
 public InvalidInputException(String message) {
     super(message);
 }
}

public class EmployeeDetails {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     try {
         // Input for Employee Name
         System.out.print("Enter employee name: ");
         String name = scanner.nextLine();
         if (name.length() < 3) {
             throw new InvalidInputException("Name should be at least 3 characters long.");
         }

         // Input for Age
         System.out.print("Enter age: ");
         int age = scanner.nextInt();
         if (age < 18) {
             throw new InvalidInputException("Age must be 18 or older.");
         }

         // Input for Salary
         System.out.print("Enter salary: ");
         double salary = scanner.nextDouble();
         if (salary < 0) {
             throw new InvalidInputException("Salary cannot be negative.");
         }

         scanner.nextLine();  // Consume the newline character after nextDouble()

         // Ask if the employee is a manager
         System.out.print("Is this employee a manager? (yes/no): ");
         String isManager = scanner.nextLine();

         if (isManager.equalsIgnoreCase("yes")) {
             // Input for Manager's Department
             System.out.print("Enter department name: ");
             String department = scanner.nextLine();

             // Create a Manager object
             Manager manager = new Manager(name, age, salary, department);
             manager.displayEmployeeDetails();
         } else {
             // Create an Employee object
             Employee employee = new Employee(name, age, salary);
             employee.displayEmployeeDetails();
         }

     } catch (InvalidInputException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("An unexpected error occurred: " + e.getMessage());
     } finally {
         scanner.close();
     }
 }
}