/**
 * AP Computer Science
 * Laila Wilcox
 * December 6th, 2024
 * Promblem Set 8A
 */

import java.util.Scanner;

public class TicTacToe{
    //Fills the whole array with [ ]
    public static String[][] InitializeBoard(String [][] board){
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                board[row][col] = "[ ]";
            }
        }
        return board;
    }

    //Prints out the board
    public static void printBoard(String [][] board){
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }

    //Checks that the move is within the boundaries of the board and not in a spot that is already taken
    public static boolean isValidMove(String[][] board, int row, int col){
        if(row >= 0 && row <= 2 && col >= 0 && col <= 2 && board[row][col].equals("[ ]")){
            return true;
        } else {
            return false;
        }
    } 

    //Checks that the move is within the boundaries of the board and not in a spot that is already taken
    public static boolean isValidInput(String move){
        if(move.length() == 3 && move.substring(1,2).equals(",")){
            return true;
        } else {
            return false;
        }
    }  

    //adds an X or O to the right spot on the board
    public static void makeMove(String [][] board, int row, int col, String player){
        board[row][col] = ("[" + player + "]");
    }

    public static boolean checkWin(String [][] board, String player){
        String symbol = "[" + player+ "]";
        if(checkRows(board, symbol) || checkColums(board, symbol) || checkDiagnoals(board, symbol)){
            return true;
        }
        return false;
    }

    public static boolean checkRows(String [][] board, String symbol){
        for (int row = 0; row < 3; row++) {
            if (board[row][0].equals(symbol) && board[row][1].equals(symbol) && board[row][2].equals(symbol)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkColums(String [][] board, String symbol){
        for (int col = 0; col < 3; col++) {
            if (board[0][col].equals(symbol) && board[1][col].equals(symbol) && board[2][col].equals(symbol)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiagnoals(String [][] board, String symbol){
        // checks top-left to bottom-right
        if (board[0][0].equals(symbol) && board[1][1].equals(symbol) && board[2][2].equals(symbol)){
            return true;
        }
        // checks top-right to bottom-left
        if (board[0][2].equals(symbol) && board[1][1].equals(symbol) && board[2][0].equals(symbol)){
            return true;
        }
        return false;
    }

    public static boolean checkDraw(String [][] board){
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col].equals("[ ]")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int findFirstValue(String move){
        String firstNum = move.substring(0,1);
        int row = Integer.parseInt(firstNum);
        return row;
    }

    public static int findSecondValue(String move){
        String secondNum = move.substring(2);
        int col = Integer.parseInt(secondNum);
        return col;
    }

}
