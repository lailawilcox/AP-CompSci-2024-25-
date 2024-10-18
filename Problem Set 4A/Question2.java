/**
 * AP Computer Science
 * Laila Wilcox
 * October 18th, 2024
 * Promblem Set 4A (Question 2) 
 */

import java.util.Scanner;

 
 
 public class Question2 {
    public static void main (String[] args) {
        StdDraw.setScale(0, 500);
        
        int x = 0;
        int y = 0;
        
        //Grid
        /*
        while (x <= 500 ){
            StdDraw.line(x, 0, x, 500);
            x = x + 10;
        }
        while (y <= 500 ){
            StdDraw.line(0, y, 500, y);
            y = y + 10;
        } 
        */
       
        //Curve Grid
        while (x <= 500 ){
            StdDraw.line(x, y, x+500, y+500);
            x = x + 10;
            y = y - 10;
        }
        while (y <= 500 ){
            StdDraw.line(x, y, x, y);
            y = y + 10;
        } 
    }
}


