package com.ct.may12;

public class EmployeeTester {
    public static void main(String[] args) {
        Manager hrManager = new Manager("Alice", 101, 50000, ManagerType.HR);
        Manager salesManager = new Manager("Bob", 102, 50000, ManagerType.SALES);

        Clerk clerk = new Clerk("Charlie", 103, 25000, 75, 85);

        System.out.println("HR Manager Salary: " + hrManager.getSalary());
        System.out.println("Sales Manager Salary: " + salesManager.getSalary());
        System.out.println("Clerk Salary: " + clerk.getSalary());

       
        clerk.setSpeed(90);
        System.out.println("Updated Clerk Salary: " + clerk.getSalary());
    }
}
