package com.java;


import java.util.Scanner;

public class ReadNumberFromInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (scanner.hasNextDouble()) {
            double number = scanner.nextDouble();
            System.out.println("You entered: " + number);
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        scanner.close(); 
    }
}
