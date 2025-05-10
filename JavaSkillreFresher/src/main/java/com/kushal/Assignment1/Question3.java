package com.kushal.Assignment1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (age >= 18) {
            System.out.print("Do you have a valid ID? (yes/no): ");
            String hasID = scanner.nextLine().trim().toLowerCase();

            if (hasID.equals("yes")) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You must have a valid ID to vote.");
            }
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();
    }
}
