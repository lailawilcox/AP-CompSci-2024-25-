/**
 * AP Computer Science
 * Laila Wilcox
 * December 6th, 2024
 * Promblem Set 8A
 */

import java.util.Scanner;

public class Driver{
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        String [][] grid = new String[3][3]; 
        int count = 1;
        String player = "X";
        boolean playing = true;
        
        
        TicTacToe.InitializeBoard(grid);
        System.out.println(player + " make your move (row, colum): ");
        

        while(playing){
            if(count%2 == 0){
                player = "O";
            }else{
                player = "X";
            }

            
            int row = input.nextInt();
            int col = input.nextInt();
            System.out.println("");
            System.out.println("Round: " + count);
            TicTacToe.TakeTurn(grid, row, col, player);
            System.out.println(player + " make your move (row, colum): ");
            count++;
        }
    }
}