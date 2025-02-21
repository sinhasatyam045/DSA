package CodeForces;
import java.util.Scanner;

public class BinaryPath {
    static int minPaths;
    static String minPathString;

    public static void lexiFind(int[][] arr, int row, int col, int i, int j, String path) {
        
        if (i == row - 1 && j == col - 1) {
            path += arr[i][j];
            if (minPathString == null || path.compareTo(minPathString) < 0) {
                minPathString = path;
                minPaths = 1;
            } else if (path.equals(minPathString)) {
                minPaths++;
            }
            return;
        }

        
        if (j + 1 < col) {
            lexiFind(arr, row, col, i, j + 1, path + arr[i][j]);
        }

        
        if (i + 1 < row) {
            lexiFind(arr, row, col, i + 1, j, path + arr[i][j]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        while (t-- > 0) {
            int n = scanner.nextInt(); 
            scanner.nextLine(); 
            String firstRow = scanner.nextLine();
            String secondRow = scanner.nextLine();

            int[][] grid = new int[2][n];
            for (int i = 0; i < n; i++) {
                grid[0][i] = Character.getNumericValue(firstRow.charAt(i));
                grid[1][i] = Character.getNumericValue(secondRow.charAt(i));
            }

            minPaths = 0;
            minPathString = null;
            lexiFind(grid, 2, n, 0, 0, "");

            System.out.println(minPathString);
            System.out.println(minPaths);
        }

        scanner.close();
    }
}
