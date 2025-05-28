package com.ct.day6;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeBook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> gradeBook = new HashMap<>();
        boolean running = true;

        while (running) {
            System.out.println("\nStudent Grade Book:");
            if (gradeBook.isEmpty()) {
                System.out.println("No students and grades to display.");
            } else {
                for (Map.Entry<String, String> entry : gradeBook.entrySet()) {
                    System.out.println("Student: " + entry.getKey() + ", Grade: " + entry.getValue());
                }
            }

            // Menu
            System.out.println("\nOptions:");
            System.out.println("1. Add Student Grade");
            System.out.println("2. Remove Student Grade");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    // Add student and grade
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter grade for " + studentName + ": ");
                    String grade = scanner.nextLine();
                    gradeBook.put(studentName, grade);
                    System.out.println("Grade added for student: " + studentName);
                    break;

                case "2":
                    // Remove student grade
                    if (gradeBook.isEmpty()) {
                        System.out.println("The grade book is empty. Nothing to remove.");
                    } else {
                        System.out.print("Enter the name of the student to remove: ");
                        String removeName = scanner.nextLine();
                        if (gradeBook.containsKey(removeName)) {
                            gradeBook.remove(removeName);
                            System.out.println("Removed student: " + removeName + " and their grade.");
                        } else {
                            System.out.println("Student not found in the grade book.");
                        }
                    }
                    break;

                case "3":
                    // Exit
                    System.out.println("Thank you for using the Student Grade Book. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option (1, 2, or 3).");
                    break;
            }
        }

        scanner.close();
    }
}
