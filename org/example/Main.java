package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        // Task 1
        String firstName = "Liam";
        String lastName = "Kelly";
        String name = firstName + " " + lastName;

        System.out.println(name);

        // Task 2
        float num1 = 5;
        float num2 = 10;
        float num3 = 8;
        float result = num1 / num2;

        System.out.println(num1 + num2);
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println(++num3);

         */

        // Task 3
        welcomeAndSum();
    }

    public static void welcomeAndSum() {
        greetings();
        sum();
    }

    public static void greetings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Please enter your first name: ");
        String fName = scanner.nextLine();
        System.out.println("Please enter your last name: ");
        String lName = scanner.nextLine();
        String fullName = fName + " " + lName;
        System.out.println("Hello " + fullName);
    }

    public static void sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num1 = scanner.nextLine();
        int num1Parsed = Integer.parseInt(num1);
        System.out.println("Enter another number: ");
        String num2 = scanner.nextLine();
        int num2Parsed = Integer.parseInt(num2);
        System.out.printf("The sum of these numbers is %d", num1Parsed + num2Parsed);
    }


}
