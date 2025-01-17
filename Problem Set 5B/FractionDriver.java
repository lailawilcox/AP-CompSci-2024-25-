/**
 * AP Computer Science
 * Laila Wilcox
 * January 8th, 2025
 * Promblem Set 5A
 */

import java.util.Scanner;

public class FractionDriver{
    public static void main (String[] args) {    
        Scanner input = new Scanner (System.in);

        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Type 'quit' to exit");
        String answer = "";
        int score = 0;
        int rounds = 0;
        boolean playing = true;

        while(!(answer.equals("quit"))){
            Fraction fraction1 = new Fraction();
            Fraction fraction2 = new Fraction();
            
            fraction1.reduce();
            fraction2.reduce();
            
            String operator = Fraction.randomOperator();
            String computedAnswer = Fraction.answer(operator, fraction1, fraction2);

            System.out.print(fraction1.toString() + operator + fraction2.toString() + " = " );
            
            answer = input.nextLine();
            
            if(answer.equals("quit")){
                playing = false;
            }
            
            if(answer.equals(computedAnswer) && playing){
                System.out.println("Correct!");
                score++;
                rounds++;
            } else if(!(answer.equals(computedAnswer)) && playing){
                System.out.println("Wrong, the answer was: " + computedAnswer);
                rounds++;
            }
        }
    
        Fraction ratio = new Fraction(score, rounds);
        
        System.out.println("Your win/loss ratio was " + ratio.toString() + ", for a score of " + (int)(((double)score/rounds) * 100) + " percent");

    }
}