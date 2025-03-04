package com.leonardof108.javaexercises.sequentialstructure;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the temperature in Celsius degrees: ");
        double celsius = scanner.nextDouble();
        System.out.printf("Fahrenheit: %.2f", (celsius * 1.8) + 32);
    }
}
