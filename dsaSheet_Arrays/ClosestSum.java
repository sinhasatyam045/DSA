package dsaSheet_Arrays;

import java.util.*;

public class ClosestSum {
    public static void findClosestSum(int nums[], int target) {
        Arrays.sort(nums);
        int sum = 0;
        int closestsum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int part1 = i + 1;
            int part2 = nums.length - 1;
            while (part1 < part2) {
                sum = nums[i] + nums[part1] + nums[part2];
                if (Math.abs(target - sum) < Math.abs(target - closestsum)) {
                    closestsum = sum;
                }
                if (sum > target) {
                    part2--;

                } else {
                    part1++;

                }
            }
        }
        System.out.print(closestsum);
    }

    public static void main(String args[]) {
        int nums[] = { 2, 1, 3, 4 };
        int target = 1;
        findClosestSum(nums, target);
    }

}
