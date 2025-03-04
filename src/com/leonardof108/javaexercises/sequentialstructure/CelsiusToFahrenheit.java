package com.leonardof108.javaexercises.sequentialstructure;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the temperature in Fahrenheit degrees: ");
        double fahrenheit = scanner.nextDouble();
        System.out.printf("Celsius: %.2f", 5 * ((fahrenheit - 32) / 9));
    }
}
