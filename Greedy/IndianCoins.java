package Greedy;

import java.util.*;

public class IndianCoins {

    public static void main(String args[]) {
        int denomination[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

        int V = 240;
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        int i = denomination.length - 1;
        while (i >= 0) {
            if (denomination[i] <= V) {
                count++;
                V = V - denomination[i];
                ans.add(denomination[i]);
            } else {
                i--;
            }
        }
        System.out.println(count);
        for (int j = 0; j < ans.size(); j++) {
            System.out.print(ans.get(j) + " ");
        }
    }

}
