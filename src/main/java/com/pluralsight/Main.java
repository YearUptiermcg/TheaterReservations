package com.pluralsight;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompt for user input
        String fullName = promptForString("Please enter your full name: ");
        String date = promptForString("What date will you be coming (MM/DD/YYYY): ");
        int ticketCount = promptForInt("How many tickets would you like? ");

        // Parse the full name to get first and last names
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[nameParts.length - 1];

        // Generate confirmation message
        String ticketWord = (ticketCount == 1) ? "ticket" : "tickets";
        String confirmationMessage = String.format("%d %s reserved for %s under %s, %s",
                ticketCount, ticketWord,
                formatDate(date), lastName, firstName);

        // Display message
        System.out.println(confirmationMessage);
    }

    // Method to prompt for a string input
    public static String promptForString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    // Method to prompt for an integer input
    public static int promptForInt(String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(scanner.nextLine().trim()); // No error handling
    }

    // Placeholder for formatDate method
    public static String formatDate(String date) {
        return date; // You can implement date formatting logic here if needed
    }
}
