package com.ct.collection_day9;

import java.util.*;

record Book(String name, String author) implements Comparable<Book> {
    @Override
    public int compareTo(Book other) {
        return this.name.compareTo(other.name); // Sort by book name
    }

    @Override
    public String toString() {
        return "Book{name='" + name + "', author='" + author + "'}";
    }
}

public class BookSorted {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();
        books.add(new Book("Java Fundamentals", "Ravi Shankar"));
        books.add(new Book("Core Java", "James Gosling"));
        books.add(new Book("Effective Java", "Joshua Bloch"));
        books.add(new Book("Java Concurrency", "Brian Goetz"));
        books.add(new Book("Data Structures", "Sahni"));

        System.out.println("Books sorted by name:");
        books.forEach(System.out::println);
    }
}
