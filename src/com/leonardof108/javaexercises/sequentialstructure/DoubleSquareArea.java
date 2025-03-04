package com.leonardof108.javaexercises.sequentialstructure;

import java.util.Scanner;

public class DoubleSquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter square area: ");
        double area = scanner.nextDouble();
        System.out.printf("the double of the area is: %.2f", area * 2);
    }
}
