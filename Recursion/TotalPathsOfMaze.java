package Recursion;

public class TotalPathsOfMaze {
    public static int countPaths(int i, int j, int n, int m) {
        // Base Case 1:if rows or column of a give n*m matrix goes out of bound
        if (i == n || j == n) {
            return 0;
        }
        // If reaches the destination (n,m)
        if (i == n - 1 && j == n - 1) {
            return 1;
        }
        int downPaths = countPaths(i + 1, j, n, m); // for counting no of initial downpaths as other downpaths are done
                                                    // recursively
        int rightPaths = countPaths(i, j + 1, n, m);// for counting no of initial rightpaths as other rightpaths are
                                                    // done recursively
        return downPaths + rightPaths;// Total paths

    }

    public static void main(String[] args) {
        int n = 3, m = 4;
        int ans = countPaths(0, 0, n, m);
        System.out.println(ans);

    }

}

// Note: Recursion is very simple. Selfish hokr apne level ka kaam kar aur baaki
// levels ka kaam apne agle levels se karana