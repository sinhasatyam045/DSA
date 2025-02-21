package Greedy;

public class BuySellStocks {

    public static void main(String args[]) {
        int stocks[] = { 7, 1, 5, 3, 6, 4 };
        int buyTime = 0; // Index to buy
        int sellTime = 0; // Index to sell
        int min = stocks[0];
        int maxProfit = 0; // Initialize maxProfit to 0

        for (int i = 1; i < stocks.length; i++) {
            if (stocks[i] > min) {
                int currentProfit = stocks[i] - min;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                    sellTime = stocks[i]; // Update the sell index
                }
            } else {
                min = stocks[i];
                buyTime = stocks[i]; // Update the buy index
            }
        }

        System.out.println("Best time is to buy a stock at Rs. " + buyTime + " and sell it at Rs.  " + sellTime +
                " for a maximum profit of Rs. " + maxProfit);
    }

}
