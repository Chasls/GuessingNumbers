package com.guessinggame.guessing;

import java.util.Random;
import java.util.Scanner;

public class GuessingBuild {

    public void guessingGame() {
        Random rand = new Random();
        int nums = 21;
        int intRandom = rand.nextInt(nums);

        Scanner sc = new Scanner(System.in);
        System.out.println("Hi whats your name?");

        String name = sc.nextLine();
        System.out.println("Hello " + name + "!  " +
                "Im thinking of a number between 1-20! " +
                "can you guess it?");
        int guessLimit = 1;
        int guesses = 1;
        boolean gamePlay = true;
        while (gamePlay == true) {


            int x = 1;

            do {


                try {
                    int guess = sc.nextInt();
                    x = 2;
                    if (guess == intRandom) {
                        System.out.println("WINNER! You guessed: " + guess +
                                "\n in " + guesses + " in tries!");
                        System.out.println("Wanna Play Again" +
                                "\nPress 1: Yes" +
                                "\nPress 2: No");
                        int playAgain = sc.nextInt();
                        x = 2;
                        if (playAgain == 1) {
                            intRandom = rand.nextInt(nums);
                            System.out.println("Try and win again " + name + "!  " +
                                    "Im thinking of a number between 1-20! " +
                                    "can you guess it?");
                            gamePlay = true;
                            guessLimit = 1;
                            guesses = 1;
                            x = 2;
                        } else if (playAgain == 2) {
                            x = 2;
                            System.exit(0);
                        }
                    } else if (guess > intRandom) {
                        System.out.println("You gussed to HIGH, try a lower number \n" +
                                "You've gussed: "  + guesses + " times.");
                        guessLimit++;
                        guesses++;
                    }else if(guess < intRandom){
                        System.out.println("You gussed to LOW, try a higher number \n" +
                                "You've gussed: "  + guesses + " times.");
                        guessLimit++;
                        guesses++;

                    }if(guessLimit > 6){
                        System.out.println("GAME OVER \n" +
                                "The Correct numer was: " + intRandom);
                        System.out.println("Wanna Play Again" +
                                "\nPress 1: Yes" +
                                "\nPress 2: No");
                        int lostPlayAgain = sc.nextInt();
                        if(lostPlayAgain == 1){
                            intRandom = rand.nextInt(nums);
                            System.out.println("Try not to lose this time " + name + "!  " +
                                    "Im thinking of a number between 1-20! " +
                                    "can you guess it?");
                            gamePlay = true;
                            guessLimit = 1;
                            guesses = 1;
                            x = 2;
                        }else if(lostPlayAgain == 2){
                            System.out.println("You tried....");
                            x = 2;
                            System.exit(0);
                        }
                    }else if( guessLimit != 6){
                        gamePlay = true;
                    }
                } catch (Exception e) {
                    System.out.println("Please use only numbers");
                    sc.nextLine();

                }
            } while (x == 1);


        }
    }
}
