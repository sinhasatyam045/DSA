package Sorting;

public class QuickSort {
    

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static int partition(int[] arr, int st, int end) {
        int piv=arr[st];
        int i=st;
        int j=end;
        while(i<=j){
            while(arr[i]<=piv && i<=end) i++;
            while(arr[j]>piv && j>=st) j--;
            if(i<j) swap(arr,i,j);
            
        }
        swap(arr,st,j);
        return j;
    }

    public static void quickSort(int[] arr, int st, int end) {
        if (st >= end)
            return;
        int pi = partition(arr, st, end);
        quickSort(arr, st, pi - 1);
        quickSort(arr, pi + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = { 7, 13, 8, 5, 10, 2, 4 };
        
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array after sorting"); // 1 3 4 5 6
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
