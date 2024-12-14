package com.yuvaraj.assignment.utilities;
import com.yuvaraj.assignment.employees.Manager;
import com.yuvaraj.assignment.employees.Developer;
public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a manager instance
        Manager manager = new Manager();
        manager.setName("Alice");
        manager.setEmployeeId(101);
        manager.setSalary(90000);
        manager.setDepartment("HR");

        // Create a developer instance
        Developer developer = new Developer();
        developer.setName("Bob");
        developer.setEmployeeId(102);
        developer.setSalary(80000);
        developer.setProgrammingLanguage("Java");

        // Use EmployeeUtilities to print details
        System.out.println("Manager Details:");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printmangerDetails(manager);

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printEmployeeDetails(developer);
        EmployeeUtilities.printdeveloperDetails(developer);

	}

}
