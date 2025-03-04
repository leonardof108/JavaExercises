package com.leonardof108.javaexercises.sequentialstructure;

import java.util.Scanner;

public class HourlyGain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your hourly gain: ");
        double hourlyGain = scanner.nextDouble();
        System.out.println("enter your monthly work hours: ");
        double monthWorkHours = scanner.nextDouble();
        System.out.printf("your monthly salary is: $%.2f", hourlyGain * monthWorkHours);
    }

}
