package com.leonardof108.javaexercises.sequentialstructure;

import java.util.Scanner;

public class AverageSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type in 4 bimestral grade scores: ");
        double firstScore = scanner.nextDouble();
        double secondScore = scanner.nextDouble();
        double thirdScore = scanner.nextDouble();
        double fourthScore = scanner.nextDouble();
        System.out.printf("the average sum of the bimestral scores is: %f", (firstScore + secondScore + thirdScore + fourthScore) / 4);

    }
}
