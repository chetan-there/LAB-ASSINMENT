// Program Questions
// StringConcatenate
// Write a Java program that uses the Stream.of method to create a stream of strings, filters out the empty strings, and then concatenate the remaining strings into a single string..

// Input:
// A stream of strings ["Hello", "", "World", " ", "from", " ", "Java", "!"].

// Output:
// A single concatenated string:
// HelloWorld from Java!
// Sample Input
// A stream of strings ["Hello", "", "World", " ", "from", " ", "Java", "!"].
// Sample Output
// A single concatenated string:
// HelloWorld from Java!

import java.util.stream.*;

public class StringConcatenate
{
    public static void main(String [] args)
    {
        String res = Stream.of("Hello ", " ", "World ", " ", "from ", "  ", "Java ", "!").filter(str -> !str.trim().isEmpty()).collect(Collectors.joining());

        System.out.println("A single concatenated string:");
        System.out.println(res);
    }
}