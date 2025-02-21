package Hashing;

import java.util.*;

public class CountDistinctElements {

    public static void countDistinct(int nums[]) {
        int count = 0;
        HashSet<Integer> mp = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            mp.add(nums[i]);

        }
        System.out.println(mp.size());
    }

    public static void main(String args[]) {
        int nums[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        countDistinct(nums);
    }

}
