package TwoDArray;

import java.util.*;

public class GridChallenge {
    public static boolean checkValid(char grid[][]) {

        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            Arrays.sort(grid[i]);
        }

        for (int k = 0; k < col; k++) {
            for (int j = 1; j < row; j++) {
                if (grid[j][k] < grid[j - 1][k]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        char grid[][] = { { 'i', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' } };
        System.out.println(checkValid(grid));
    }

}
