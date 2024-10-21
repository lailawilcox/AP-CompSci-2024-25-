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
        int y = 500;
        int x2 = 0;
        int y2 = 0;
        //-----------------------------------------------------------------------
        /*
        //Grid
        while (x <= 500 ){
        StdDraw.line(x, 0, x, 500);
        x = x + 10;
        }
        while (y <= 500 ){
        StdDraw.line(0, y, 500, y);
        y = y + 10;
        } 
         */
        //-----------------------------------------------------------------------
        /*
        //Curve Grid
        while (x <= 500){
        StdDraw.line(x, y, x2, y2);
        x = x + 10;
        y2 = y2 + 10;
        }
        x = 0;
        y = 0;
        x2 = 500;
        y2 = 0;
        while (y2 >= 0){
        StdDraw.line(x, y, x2, y2);
        x = x + 10;
        y2 = y2 + 10;
        } 
         */
        //-----------------------------------------------------------------------
        /*
        //Cirlces
        int r = 500;
        int c = 1;
        while (r >= 0){
        if(c < 1){
        StdDraw.setPenColor(StdDraw.BLACK);
        } else {
        StdDraw.setPenColor(StdDraw.WHITE);
        }
        StdDraw.filledCircle(250, 250, r);
        r = r - 20;
        c = c*(-1);
        }
         */
    }
}

