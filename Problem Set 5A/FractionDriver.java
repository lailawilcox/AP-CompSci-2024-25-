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
        
        //Constructors
        Fraction whole = new Fraction();
        Fraction half = new Fraction(1,2);
        Fraction third = new Fraction("1/3");
        Fraction anotherHalf = new Fraction(half);
        
        System.out.println("Whole Fraction: " + whole);
        System.out.println("Half Fraction: " + half);
        System.out.println("Third Fraction: " + third);
        System.out.println("Another Half Fraction: " +anotherHalf);
        System.out.println("");
        
        //Accessor Methods
        Fraction test1 = new Fraction(5,40);
        
        System.out.println("Test Fraction 1: " + test1);
        System.out.println("Numerator of Test Fraction 1: " + test1.getNumerator());
        System.out.println("Denominator of Test Fraction 1: " + test1.getDenominator());
        System.out.println("Test Fraction 1 as a double: " + test1.toDouble());
        System.out.println("Test Fraction 1 as a string: " + test1.toString());
        System.out.println("");
        
        //Static Methods
        Fraction fraction1 = new Fraction(1,2);
        Fraction fraction2 = new Fraction(1,4);
        
        System.out.println("Fraction 1: " + fraction1);
        System.out.println("Fraction 2: " + fraction2);
        
        System.out.println("Multiply Fraction 1 with Fraction 2: " + Fraction.multiply(fraction1, fraction2));
        System.out.println("Divide Fraction 1 with Fraction 2: " + Fraction.divide(fraction1, fraction2));
        System.out.println("Add Fraction 1 with Fraction 2: " + Fraction.add(fraction1, fraction2));
        System.out.println("Substract Fraction 1 with Fraction 2: " + Fraction.subtract(fraction1, fraction2));
        System.out.println("");

    }
}
