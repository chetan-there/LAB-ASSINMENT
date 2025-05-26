package com.ct.collection_day4;

public class EmployeeDirectoryExample {
    public static void main(String[] args) {
        Directory directory = new Directory();

        // Adding employees
        Employee alice = new Employee("Alice", "Manager", 60000.0);
        Employee bob = new Employee("Bob", "Developer", 50000.0);
        directory.addEmployee(alice);
        directory.addEmployee(bob);

        // Initial display
        directory.displayAllEmployees();

        // Updating Bob's details
        directory.updateEmployee(1, "Senior Developer", 55000.0);
        directory.displayAllEmployees();

        // Deleting Alice
        directory.deleteEmployee(0);
        directory.displayAllEmployees();
    }
}