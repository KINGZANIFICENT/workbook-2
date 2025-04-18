package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // CellPhone
        CellPhone cellPhone = new CellPhone();

        // prompt user
        System.out.print("What is the serial number? ");
        int serial = scanner.nextInt();
        scanner.nextLine(); // consume newline
        cellPhone.setSerialNumber(serial);

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();
        cellPhone.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        cellPhone.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        cellPhone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        cellPhone.setOwner(owner);

        // print out the phones details
        System.out.println("\nCell Phone Details:");
        System.out.println("Serial Number: " + cellPhone.getSerialNumber());
        System.out.println("Model:         " + cellPhone.getModel());
        System.out.println("Carrier:       " + cellPhone.getCarrier());
        System.out.println("Phone Number:  " + cellPhone.getPhoneNumber());
        System.out.println("Owner:         " + cellPhone.getOwner());

        scanner.close();
    }
}

