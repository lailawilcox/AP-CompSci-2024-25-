/**
 * AP Computer Science
 * Laila Wilcox
 * September 9th, 2024
 * Promblem Set 2B (Driver)
 */

import java.util.Scanner;

class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringTools sTools = new StringTools();
        
        System.out.println("lastLetter test cases:");
        System.out.println("Enter a word with at least one character: ");
        String answer1 = input.nextLine();
        System.out.println("The last letter is " + sTools.lastLetter(answer1));
        System.out.println("---------------------");
        
        System.out.println("formatPhoneNumber test cases:");
        System.out.println("Enter a phone number: ");
        String number1 = input.nextLine();
        System.out.println("The number is " + sTools.formatPhoneNumber(number1));
        System.out.println("---------------------");
        
        System.out.println("middleThree test cases:");
        System.out.println("Enter a word with a odd amount of letters: ");
        String middle3 = input.nextLine();
        System.out.println("The middle three letters are " + sTools.middleThree(middle3));
        System.out.println("---------------------");
        
        System.out.println("swapLastTwo test cases:");
        System.out.println("Enter a word with atleaset two letters: ");
        String last2 = input.nextLine();
        System.out.println("The new word is " + sTools.swapLastTwo(last2));
        System.out.println("---------------------");
        
        System.out.println("frontAgain test cases:");
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        System.out.println("Enter a amount of letters to check: ");
        int n = input.nextInt();
        System.out.print(sTools.frontAgain(word, n));
        System.out.println(sTools.frontAgain2(word, n));
        System.out.println("---------------------");
    }
}
