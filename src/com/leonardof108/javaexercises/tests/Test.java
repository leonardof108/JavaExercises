package com.leonardof108.javaexercises.tests;

public class Test {
    public static void main(String[] args) {
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }
            if (x == 2) {
                System.out.print("b c");
            }
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
            x = x - 1;
            System.out.print("-");
        }
    }
}
