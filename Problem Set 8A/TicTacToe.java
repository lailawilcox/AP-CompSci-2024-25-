/**
 * AP Computer Science
 * Laila Wilcox
 * December 6th, 2024
 * Promblem Set 8A
 */

import java.util.Scanner;

public class TicTacToe{
    public static String[][] InitializeBoard(String [][] grid){
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                System.out.print(grid[row][col] = "[" + " " + "]");
            }
            System.out.println();
        }
        return grid;
    }

    public static String[][] TakeTurn(String [][] grid, int row, int col, String player){

        for(int row1 = 0; row1 < grid.length; row1++){
            for(int col1 = 0; col1 < grid[0].length; col1++){
                if(row1 == row && col1 == col){
                    System.out.print(grid[row1][col1] = "[" + player + "]");
                } else{
                     System.out.print(grid[row1][col1] = "[" + " " + "]");
                }
            }
            System.out.println();
        }
        return grid;
    }

}