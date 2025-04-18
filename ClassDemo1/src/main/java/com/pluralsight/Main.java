package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("What Is Your Full Name: ");
        String fullname = scanner.nextLine();

        System.out.println("What Is The Persons Age: ");
        int age = scanner.nextInt();

        System.out.println("what is the persons profession: ");
        String profession = scanner.nextLine();

        displayPerson(fullname. age, profession);
        savePerson(fullname. age, profession);



    }

    public static void displayPerson(String fullname, int age, String profession){
        System.out.printf("Person %s is a %s and is %d years old," + fullname, profession, age);
    }


    public static void savePerson(String fullname, int age, String profession) {
    }
}