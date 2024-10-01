/**
 * AP Computer Science
 * Laila Wilcox
 * September 9th, 2024
 * Promblem Set 2C (Driver)
 */

import java.util.Scanner;

class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Quadratic Formula
        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b and c");
        
        System.out.print("a: ");
        double a1 = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();
        System.out.print("c: ");
        double c = input.nextDouble();
        
        System.out.println("The solutions for " +a1+ "x^2 + " +b+ "x + " +c+ " are (" + Formula.Quadratic(a1, b, c) + ")");
        System.out.println("");
        
        //Slope Formula
        System.out.println("SLOPE FORMULA: Find the slope between points (x1,y1) and (x2,y2)");

        System.out.print("x1: ");
        double Sx1 = input.nextDouble();
        System.out.print("y1: ");
        double Sy1 = input.nextDouble();
        System.out.print("x2: ");
        double Sx2 = input.nextDouble();
        System.out.print("y2: ");
        double Sy2 = input.nextDouble();
        
        OrderedPair Sp1 = new OrderedPair(Sx1, Sy1);
        OrderedPair Sp2 = new OrderedPair(Sx2, Sy2);
        
        System.out.println("A line between " + Sp1 + " and " + Sp2 + " has a slope of " + Formula.Slope(Sp1, Sp2));
        System.out.println("");
        
        //Midpoint Formula
        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)");

        System.out.print("x1: ");
        double Mx1 = input.nextDouble();
        System.out.print("y1: ");
        double My1 = input.nextDouble();
        System.out.print("x2: ");
        double Mx2 = input.nextDouble();
        System.out.print("y2: ");
        double My2 = input.nextDouble();
        
        OrderedPair Mp1 = new OrderedPair(Mx1, My1);
        OrderedPair Mp2 = new OrderedPair(Mx2, My2);
        
        System.out.println("The midpoint between " + Mp1 + " and " + Mp2 + " is "+ Formula.Midpoint(Mp1, Mp2));
        System.out.println("");
        
        //Sum of an Arithmetic Series
        System.out.println("SUM OF AN ARITHMETIC SERIES");

        System.out.print("Number of terms: ");
        int k = input.nextInt();
        System.out.print("Starts with: ");
        double a = input.nextDouble();
        System.out.print("Increase by: ");
        double d = input.nextDouble();
        
        System.out.println("The sum of the first 5 terms of an arithmetic series that starts with "+a+ " and increases by " +d+ " is " + Formula.findArithmeticSeriesSum(a,d,k));
        System.out.println(" ");
        
        //Sum of an Geometric Series
        System.out.println("SUM OF AN GEOMETRIC SERIES");

        System.out.print("Number of terms: ");
        int Gk = input.nextInt();
        System.out.print("Starts with: ");
        double Ga = input.nextDouble();
        System.out.print("Increase by: ");
        double r = input.nextDouble();
        
        System.out.println("The sum of the first " +Gk+ " terms of a finite geometric series that starts with "+Ga+" and increases by a rate of " +r+ " is " + Formula.findGeometricSeriesSum(Ga,r,Gk));
        System.out.println(" ");
        
        //Die Roller
        System.out.println("DIE ROLLER");

        System.out.print("How many sides does your die have?");
        int sides = input.nextInt();
        
        System.out.println("Rolling a " +sides+ " die...  you got " +Formula.rollDie(sides));
    }
}