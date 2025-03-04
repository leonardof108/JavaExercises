package com.leonardof108.javaexercises.sequentialstructure;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the circle radius: ");
        double radius = scanner.nextDouble();
        System.out.printf("the area of the circle is: %f", Math.PI * (Math.pow(radius, 2)));
    }
}
