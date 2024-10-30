/**
 * AP Computer Science
 * Laila Wilcox
 * October 28, 2024
 * Promblem Set 4C (Driver)
 */

import java.util.Scanner;

class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Review: ");
        System.out.println(Review.textToString("SimpleReview.txt"));
        System.out.println(" ");
        
        System.out.print("Value of the Review: ");
        System.out.println(Review.totalSentiment("SimpleReview.txt"));
        System.out.println(" ");
        
        System.out.print("Star Rating of the Review: ");
        System.out.println(Review.starRating("SimpleReview.txt"));
        System.out.println(" ");
        
        System.out.print("Fake Review: ");
        System.out.println(Review.fakeReview("SimpleReview.txt"));
        System.out.println(" ");
        
    }
}