
package Hashing;

import java.util.ArrayList;
import java.util.Collections;

public class FindMedian {

    public static void printMedian(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            list.add(curr);
            Collections.sort(list);

            int size = list.size();
            if (size % 2 == 0) {
                int mid2 = list.get(size / 2);
                int mid1 = list.get((size / 2) - 1);
                System.out.println("Median: " + (mid1 + mid2) / 2.0);
            } else {
                int mid = list.get(size / 2);
                System.out.println("Median: " + mid);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 15, 1, 3 };
        printMedian(arr);
    }
}
