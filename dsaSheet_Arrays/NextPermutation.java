package dsaSheet_Arrays;

import java.util.*;

public class NextPermutation {
    static void printOutput(int arr[], int n) {
        int idx = -1, i, j;
        for (i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            reverse(arr, 0, n - 1);
            return;
        }
        for (j = n - 1; j > idx; j--) {
            if (arr[j] > arr[idx]) {
                break;
            }
        }
        swap(arr, idx, j);
        reverse(arr, idx + 1, n - 1);

    }

    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);

        }
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String args[]) {
        int arr[] = { 2,1,3};
        int n = arr.length;
        printOutput(arr, n);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
