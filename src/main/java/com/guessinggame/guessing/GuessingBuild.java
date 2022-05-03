package com.guessinggame.guessing;

import java.util.Random;
import java.util.Scanner;

public class GuessingBuild {

    public void guessingGame() {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int nums = 21;
        int intRandom = rand.nextInt(nums);
        System.out.println("Hi whats your name?");

        String name = sc.nextLine();
        System.out.println("Hello " + name + "!  " +
                "Im thining of a number between 1-20! " +
                "can you guess it?");
        int guessLimit = 1;
        int guesses = 1;

        while (true) {


            int guess = sc.nextInt();
            if (guess > intRandom && guessLimit < 6) {
                System.out.println("Your guess was to HIGH " +
                        "try guessing a lower number" +
                        " guesses: " + guesses);
                guesses++;
                guessLimit++;
            } else if (guess < intRandom && guessLimit < 6) {
                System.out.println("Your guess was to LOW " +
                        "trying guessing a higher number" +
                        " guesses: " + guesses);
                guesses++;
                guessLimit++;
            } else if (guess == intRandom) {
                System.out.println("YOU DID IT!! in " + guesses + " guesses!");
            } else if (guessLimit >= 6) {
                System.out.println("You lost!! the answer was " + intRandom + "!");

            } else {
                try {
                    System.out.println("Invalded input: " + guess);
                } catch (ExceptionInInitializerError E) {
                    System.out.println("resetApp");
                }
            }
        }
    }
}
