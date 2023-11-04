package com.java;
import java.util.Scanner;

public class EvenFibonacciSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (N): ");
        int N = scanner.nextInt();

        long sum = findEvenFibonacciSum(N);

        System.out.println("The sum of even Fibonacci numbers up to " + N + " is: " + sum);

        scanner.close();
    }

    public static long findEvenFibonacciSum(int N) {
        long sum = 0;
        long a = 0;
        long b = 1;

        while (b <= N) {
            if (b % 2 == 0) {
                sum += b;
            }

            long nextTerm = a + b;
            a = b;
            b = nextTerm;
        }

        return sum;
    }
}

