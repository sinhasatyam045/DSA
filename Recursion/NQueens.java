package Recursion;

import java.util.*;

public class NQueens {

    public boolean isSafe(int row, int col, char board[][]) {
        // Horizontal check
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q')
                return false;
        }
        // Vertical check
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q')
                return false;
        }
        // Upperleft check
        int r = row;
        for (int c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q')
                return false;
        }
        // Upperright check
        r = row;
        for (int c = col; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q')
                return false;
        }
        // Lowerleft check
        r = row;
        for (int c = col; r < board.length && c >= 0; r++, c--) {
            if (board[r][c] == 'Q')
                return false;
        }
        // Lowerright check
        r = row;
        for (int c = col; r < board.length && c < board.length; r++, c++) {
            if (board[r][c] == 'Q')
                return false;
        }
        return true;

    }

    public void saveBoard(char board[][], List<List<String>> allBoards) {
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';

            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        // Base Case:if reaches the last col of board,then print the board
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        // for placing each queen to the row one by one and checking if its a safe place
        // for the queen or not.
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char board[][] = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }

}
