package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Read full name and split into first/last
        System.out.print("Enter your full name (First Last): ");
        String fullName = scanner.nextLine().trim();
        String[] nameParts = fullName.split("\\s+");
        String firstName = nameParts[0];
        String lastName  = nameParts[nameParts.length - 1];

        // 2) Read the date string
        System.out.print("Enter date of show (MM/dd/yyyy): ");
        String dateInput = scanner.nextLine().trim();

        // 3) Parse into LocalDate using a formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate showDate;
        try {
            showDate = LocalDate.parse(dateInput, formatter);
        } catch (DateTimeParseException ex) {
            System.out.println("Invalid date format. Please use MM/dd/yyyy.");
            scanner.close();
            return;
        }

        // 4) Read number of tickets
        System.out.print("How many tickets: ");
        int count = scanner.nextInt();

        // 5) Singular vs plural
        String ticketWord = (count == 1) ? "ticket" : "tickets";

        // 6) Print confirmation, re‑formatting the LocalDate back to MM/dd/yyyy
        System.out.printf(
                "%d %s reserved for %s under %s, %s%n",
                count,
                ticketWord,
                showDate.format(formatter),
                lastName,
                firstName
        );
    }
}
