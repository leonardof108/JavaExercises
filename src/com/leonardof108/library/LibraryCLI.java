package com.leonardof108.library;

public class LibraryCLI {
    public static void fizzBuzz(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {

        Book book1 = new Book("Stephen King", "The Shining", "1234");
        Book book2 = new Book("Bret Easton Ellis", "American Psycho", "5678");
        Book book3 = new Book("George Orwell", "1984", "9012");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        fizzBuzz(15);
    }
}
