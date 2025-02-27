package com.leonardof108.javaexercises.tests;

public class Test {
    public static void main (String[] args){
        int x = 1;
        System.out.println("before loop");
        while (x<4){
            System.out.println("inside the loop");
            System.out.println("value of x is "+x);
            x+=1;
        }
        System.out.println(x);
    }
}
