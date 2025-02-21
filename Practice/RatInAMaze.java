package Practice;
import java.util.*;

public class RatInAMaze {

    public static ArrayList<String> list = new ArrayList<>();

    public static void findAllPath(int grid[][], int i, int j, String path, int N, int vis[][]) {
        // If we reach the bottom-right corner, add the path to the list
        if (i == N-1 && j == N-1) {
            list.add(path);
            return;
        }

        // Mark the current cell as visited
        vis[i][j] = 1;

        // Move Down
        if (i + 1 < N && vis[i + 1][j] == 0 && grid[i + 1][j] == 1) {
            findAllPath(grid, i + 1, j, path + 'D', N, vis);
        }

        // Move Up
        if (i - 1 >= 0 && vis[i - 1][j] == 0 && grid[i - 1][j] == 1) {
            findAllPath(grid, i - 1, j, path + 'U', N, vis);
        }

        // Move Right
        if (j + 1 < N && vis[i][j + 1] == 0 && grid[i][j + 1] == 1) {
            findAllPath(grid, i, j + 1, path + 'R', N, vis);
        }

        // Move Left
        if (j - 1 >= 0 && vis[i][j - 1] == 0 && grid[i][j - 1] == 1) {
            findAllPath(grid, i, j - 1, path + 'L', N, vis);
        }

        // Unmark the current cell as visited
        vis[i][j] = 0;
    }

    public static void main(String[] args) {
        int grid[][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };
        int N = grid.length;
        int vis[][] = new int[N][N];

        findAllPath(grid, 0, 0, "", N, vis);

        for (String path : list) {
            System.out.print(path + " ");
        }
    }
}
