package Hashing;

import java.util.*;

public class UnionAndIntersection {
    public static HashSet<Integer> mp = new HashSet<>();

    public static void printUnion(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            mp.add(arr1[i]);

        }
        for (int j = 0; j < arr2.length; j++) {
            mp.add(arr2[j]);
        }
        System.out.println(mp.size() + "," + mp);
    }

    public static void printIntersection(int arr1[], int arr2[]) {
        mp.clear();
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            mp.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {

            if (mp.contains(arr2[j])) {
                count++;
                mp.remove(arr2[j]);
            }

        }
        System.out.print(count);
    }

    public static void main(String args[]) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        printUnion(arr1, arr2);
        printIntersection(arr1, arr2);
    }

}
