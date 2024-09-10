/**
 * AP Computer Science
 * Laila Wilcox
 * September 9th, 2024
 * Promblem Set 1A (Question 2)
 */

import java.util.Scanner;

public class InputOutput{
    public static void main (String[] args) {
      Scanner input = new Scanner (System.in);
      System.out.print("What is your favorite movie?");
      String Movie = input.nextLine();
      
      System.out.print("What is your movie snack?");
      String Snack = input.nextLine();
      
      System.out.print("How many years has it been since you went to a movie theater?");
      int Time = input.nextInt();
      
      System.out.print("Wait, what year is it now?");
      int Year = input.nextInt();
      
      String name = input.nextLine();
      System.out.println("Ok! So what I have learned is:");
      System.out.println("Your favourite move is " + Movie);
      System.out.print("When you watch " + Movie);
      System.out.println(" you like to snack on " + Snack);
      System.out.println("The last time you went to the theater was " + (Year-Time));
      
    }
}