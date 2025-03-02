package com.leonardof108.javaexercises.sequentialstructure;

import java.util.Scanner;

public class MToCm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("convert meters to centimeters: ");
        double mValue = scanner.nextDouble();
        System.out.printf("%.2fm to centimeters is: %.2fcm", mValue, mValue * 100);
    }
}
