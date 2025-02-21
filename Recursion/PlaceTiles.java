package Recursion;

public class PlaceTiles {
    public static int countWays(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        int horizonatl_ways = countWays(n - 1, m);
        int vertical_ways = countWays(n - m, m);
        return horizonatl_ways + vertical_ways;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        int ans=countWays(n, m);
        System.out.println(ans);
    }

}
