package com.leonardof108.battleshipgame;

import java.util.Scanner;

public class SimpleStartupGame {
    /*
     * make the single SimpleStartup object
     * make a location for it (three consecutive cells on a single row of seven virtual cells
     * ask the user for a guess
     * check the guess
     * repeat until the startup is sunk
     * tell the user how many guesses it took
     * */
    public static void main(String[] args) {
        /*
         * DECLARE an int variable to hold the number of user guesses, named numOfGuesses
         * DECLARE a Scanner object to check for user input
         * COMPUTE a random number between 0 and 4 that will be the starting location cell position
         * WHILE the Startup is still alive:
         *   GET user input from the command line
         * */
        /*
         * public static void main (String [] args)
         * DECLARE an int variable to hold the number of user guesses, named numOfGuesses, and set it to 0
         * MAKE a new SimpleStartup instance
         * COMPUTE a random number between 0 and 4 that will be the starting location cell position
         * MAKE an int array with 3 ints using the randomly generated number, that number incremented by 1,
         * and that number incremented by 2 (example: 3,4,5)
         * INVOKE the setLocationCells() method on the SimpleStartup instance
         * DECLARE a boolean variable representing the state of the game, named isAlive. SET it to true
         * WHILE the Startup is still alive (isAlive == true):
         * GET user input from the command line
         * // CHECK the user guess
         * INVOKE the checkYourself() method on the SimpleStartup instance
         * INCREMENT numOfGuesses variable
         * // CHECK for Startup death
         * IF result is “kill”
         * SET isAlive to false (which means we won’t enter the loop again)
         * PRINT the number of user guesses
         * END IF
         * END WHILE
         * END METHOD
         * */
        int numOfGuesses = 0;
        Scanner scanner = new Scanner(System.in);
        SimpleStartup theStartup = new SimpleStartup();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theStartup.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive) {
            System.out.print("enter a number: ");
            int guess = scanner.nextInt();
            String result = theStartup.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.printf("You took %d guesses", numOfGuesses);
            }
        }
    }
}
