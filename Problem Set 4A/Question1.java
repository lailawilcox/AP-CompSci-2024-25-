/**
 * AP Computer Science
 * Laila Wilcox
 * October 18th, 2024
 * Promblem Set 4A (Question 1) 
 */

import java.util.Scanner;

public class Question1 {
    public static void main (String[] args) {
        //Set up
        Scanner input = new Scanner (System.in);

        //Guess the Number
        int num = (int) ((Math.random()*100) +1);
        System.out.println(num);
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        System.out.print("Your guess: ");
        int guess = input.nextInt();
        int tries = 1;
        while (guess != num) {
            if (guess < num){
                System.out.print("Nope, that guess is too low,");
            } else {
                System.out.print("Nope, that guess is too high,");
            }
            System.out.println(" guess again!");
            System.out.print("Your guess: ");
            guess = input.nextInt();
            tries++;
        }
        System.out.print("You guessed it! It took you " +tries+ " tires");
    }
}