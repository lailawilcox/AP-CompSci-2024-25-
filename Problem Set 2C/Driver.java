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
        System.out.println("Machine to solve for x intercepts of a quadriatic equation of the format ax^2 + bx + c");
        System.out.println("--------------------------------------------------------------------------------------");
        
        System.out.print("Insert value of a: ");
        double a = input.nextDouble();
        System.out.print("Insert value of b: ");
        double b = input.nextDouble();
        System.out.print("Insert value of c: ");
        double c = input.nextDouble();
        
        System.out.println("The values of x for the equation " +a+ "x^2 + " +b+ "x + " +c+ " are: " + Formula.Quadratic(a, b, c));
        
        //Slope Formula
        System.out.println("Machine to find the slope of a line with two points");
        System.out.println("---------------------------------------------------");
        System.out.print("Insert value of x1: ");
        double x1 = input.nextDouble();
        System.out.print("Insert value of y1: ");
        double y1 = input.nextDouble();
        System.out.print("Insert value of x2: ");
        double x2 = input.nextDouble();
        System.out.print("Insert value of y2: ");
        double y2 = input.nextDouble();
        
        System.out.print("The slope of the line with the points (" +x1+ ", " +y1+  ") and (" +x2+ ", " +y2+  ") is " + Formula.Slope(x1, y1, x2, y2));
    }
}
