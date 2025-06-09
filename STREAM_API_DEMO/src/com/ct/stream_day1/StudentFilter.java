// Program Questions
// StudentFilter
// You have a Student record with the following fields:
// name : (String)
// course : (String)

// Create a ELC class StudentFilter.
// Given a list of Student objects, where each student is enrolled in different courses, write a Java program to filter out the students who are enrolled in the "Java" course and print their names using the forEach method and the stream API.

// Test Case 1:
// Input:
// List<Student> students =  [("Alice", "Java"),
//    ("Bob", "Python"),
//    ("Charlie", "Java"),
//    ("David", "C++"),
//    ("Eve", "JavaScript")]
// Expected Output:
// Alice
// Charlie

// Test Case 2:
// Input:
// List<Student> students = [("Alice", "Python"),
//     ("Bob", "Python"),
//     ("Charlie", "Python"),
//     ("David", "C++"),
//    ("Eve", "JavaScript")]
// Expected Output:

// Test Case 3:
// Input:
// List<Student> students = [
//     ("Alice", "Java"),
//     ("Bob", "Java"),
//     ("Charlie", "Java"),
//     ("David", "Java"),
//     ("Eve", "Java")]
// Expected Output:
// Alice
// Bob
// Charlie
// David
// Eve
// Sample Input
// List<Student> students = [
//     ("Alice", "Java"),
//     ("Bob", "Java"),
//     ("Charlie", "Java"),
//     ("David", "Java"),
//     ("Eve", "Java")]
// Sample Output
// Alice
// Bob
// Charlie
// David
// Eve


//Answer


import java.util.*;

record Student(String name, String course){
}

public class StudentFilter
{
    public static void main(String [] args)
    {
        List <Student> students = List.of(
            new Student("Alice", "Java"),
            new Student("Bob", "Java"),
            new Student("Charlie", "Java"),
            new Student("David", "C++"),
            new Student("Eve", "Java")
        );

        students.stream().filter(student -> "Java".equals(student.course())).map(Student::name).forEach(System.out::println);

    }
}