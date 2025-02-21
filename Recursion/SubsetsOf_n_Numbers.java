package Recursion;

import java.util.*;

public class SubsetsOf_n_Numbers {
    public static void printSubsets(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        // Base Case:
        if (n == 0) {
            printSubsets(subset);
            return;
        }

        // Choice 1:To get added
        subset.add(n);
        findSubsets(n - 1, subset);
        // Choice 2: Not to get added
        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);

    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);

    }

}
