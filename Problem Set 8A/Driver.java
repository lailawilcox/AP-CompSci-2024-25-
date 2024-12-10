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
        boolean playing = true;
        int row = 0;
        int col = 0;

        while(playing){
            String[][] board = new String[3][3];
            TicTacToe.InitializeBoard(board);
            boolean gameFinished = false;
            int count = 1;
            String player = "X";

            while(gameFinished == false && count <= 9){
                System.out.println("");

                System.out.println("Round: " + count);
                TicTacToe.printBoard(board);
                System.out.print(player + ", make your move (row,column): ");

                String move = input.nextLine();

                //loops until the move is valid, if the move is valid it skips this
                while(TicTacToe.isValidInput(move) == false){
                    System.out.print("Invalid format! Please try again (row,col):");
                    move = input.nextLine();
                }

                row = TicTacToe.findFirstValue(move);
                col = TicTacToe.findSecondValue(move);

                //loops until the input is in the right format, if the input is in the right format it skips this 
                while(TicTacToe.isValidMove(board, row, col) == false){
                    System.out.print("Invalid move! Please try again:");
                    move = input.nextLine();
                    //loops until the move is valid, if the move is valid it skips this
                    while(TicTacToe.isValidInput(move) == false){
                        System.out.print("Invalid format! Please try again (row,col):");
                        move = input.nextLine();
                    }
                    row = TicTacToe.findFirstValue(move);
                    col = TicTacToe.findSecondValue(move);
                }

                //if the move is valid it makes the move
                TicTacToe.makeMove(board, row, col, player);
                count++;

                //check if the player won
                if(TicTacToe.checkWin(board, player)) {
                    System.out.println("");
                    System.out.println("Congratulations! Player " + player + " wins!");
                    TicTacToe.printBoard(board);
                    gameFinished = true;
                }

                //checks for a draw (if the board is full)
                if (TicTacToe.checkDraw(board)) {
                    System.out.println("");
                    System.out.println("It's a draw!");
                    TicTacToe.printBoard(board);
                    gameFinished = true;
                }

                //switches player
                if(player.equals("X")){
                    player = "O";
                } else{
                    player = "X";
                }
            }

            //check if they want to play again
            System.out.println("Do you want to play again? (Y/N): ");
            String response = input.nextLine();
            if(response.equals("Y")){
                playing = true;
            } else if (response.equals("N")){
                playing = false;
            }
            System.out.println("");
        }
        System.out.println("Thanks for playing!");
    }
}