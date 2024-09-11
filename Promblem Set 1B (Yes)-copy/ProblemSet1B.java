/**
 * AP Computer Science
 * Laila Wilcox
 * September 9th, 2024
 * Promblem Set 1B 
 */

import java.util.Scanner;

public class ProblemSet1B {
    public static void main (String[] args) {
    //Set up
    Scanner input = new Scanner (System.in);
    
    //Celsius to Farenheit
    System.out.println("*** Celsius --> fahrenheit ***");
    System.out.print("Enter a temperature in Celsius: ");
    double Celsius = input.nextDouble();
    System.out.println(Celsius + " Celsius = " + (Celsius * 9.0/5 + 32) + " Fahrenheit");
    System.out.println("");
    
    //BMI Calculator
    System.out.println("*** BMI Calculator ***");
    System.out.print("Enter weight in kg: ");
    double weight = input.nextDouble();
    System.out.print("Enter height in m: ");
    double height = input.nextDouble();
    System.out.println("A " + height + "m tall person who weighs " + weight + "kg has a BMI of " + weight/(height * height));
    System.out.println("");

    //Days to Weeks and Days
    System.out.println("*** Days --> Weeks and Days ***");
    System.out.print("Enter a number of days: ");
    int days = input.nextInt();
    System.out.println(days + " days is equal to " + days/7 + " weeks, " + days%7 + " days");
    System.out.println("");
    
    //Receipt Generator
    System.out.println("*** Receipt Generator ***");
    System.out.print("Number of units you're buying: ");
    double units = input.nextDouble();
    System.out.print("Price per unit: ");
    double price = input.nextDouble();
    System.out.print("Tax rate: ");
    double tax = input.nextDouble();
    System.out.println();
    double total = units*price;
    double taxpercent = tax/100;
    double totaltax = total*taxpercent;
    System.out.println("Purchasing "+units+" units at $"+price+" with "+tax+"% tax will cost $"+ (total + totaltax));
    System.out.println("");
    
    //Sum of digits
    System.out.println("*** Sum of Digits ***");
    System.out.print("Enter a postive, three-digit number: ");
    int Digits = input.nextInt();
    
    System.out.println("The sum of the digits of "+Digits+"is ");
    }
}