package com.leonardof108.javaexercises.sequentialstructure;

import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type a number: ");
        int typedNumber = scanner.nextInt();
        System.out.printf("the number you typed was: %d", typedNumber);
    }
}
