package com.java;


class ComplexNumber {
    double real;
    double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }
}

public class AddComplexNumbers {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3.5, 2.0);
        ComplexNumber num2 = new ComplexNumber(1.5, -1.0);

        ComplexNumber sum = num1.add(num2);

        System.out.println("Complex Number 1: " + num1);
        System.out.println("Complex Number 2: " + num2);
        System.out.println("Sum of Complex Numbers: " + sum);
    }
}
