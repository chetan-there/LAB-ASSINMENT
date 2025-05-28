package com.ct.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Contact> addressBook = new HashMap<>();
        boolean running = true;

        while (running) {
            // Display Address Book
            System.out.println("\nAddress Book:");
            if (addressBook.isEmpty()) {
                System.out.println("The address book is empty.");
            } else {
                for (Contact contact : addressBook.values()) {
                    System.out.println(contact);
                }
            }

            // Display menu
            System.out.println("\nOptions:");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    // Add contact
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    Contact newContact = new Contact(name, phoneNumber);
                    addressBook.put(name, newContact);
                    System.out.println("Contact added: " + name);
                    break;

                case "2":
                    // Remove contact
                    if (addressBook.isEmpty()) {
                        System.out.println("The address book is empty. Nothing to remove.");
                    } else {
                        System.out.print("Enter the name of the contact to remove: ");
                        String removeName = scanner.nextLine();
                        if (addressBook.containsKey(removeName)) {
                            addressBook.remove(removeName);
                            System.out.println("Contact removed: " + removeName);
                        } else {
                            System.out.println("Contact not found: " + removeName);
                        }
                    }
                    break;

                case "3":
                    // Exit
                    System.out.println("Thank you for using the Address Book. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }

        scanner.close();
    }
}
