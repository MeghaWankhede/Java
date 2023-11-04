package com.java;  
import java.util.Scanner;

public class GCDHCFCalculator {
    
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateGCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcd = calculateGCD(num1, num2);

        System.out.println("The GCD (HCF) of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }
}

