package com.leonardof108.javaexercises.sequentialstructure;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type in two numbers:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.printf("the sum of %d and %d is: %d", firstNumber, secondNumber, firstNumber + secondNumber);
    }
}
