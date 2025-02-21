package DP;

public class CoinChange {

    public static int countWays(int coins[], int sum,int n) {
        if (sum == 0)
            return 1;

     
        if (sum < 0 || n <= 0)
            return 0;

     
        return countWays (coins, sum, n - 1) + countWays (coins, sum - coins[n - 1], n);
    }

   

    public static void main(String args[]) {
        int coins[] = {2, 5, 3, 6};
        int sum = 10;
        int n=coins.length;
        System.out.print(countWays(coins, sum,n));
    }

}
