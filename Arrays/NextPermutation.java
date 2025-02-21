package Arrays;

public class NextPermutation {
    public static void main(String args[]) {
        int arr[] = { 1, 5, 8, 4, 7, 6, 5, 3, 1 };
        printNextPermutation(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void printNextPermutation(int arr[]) {
        int idx = -1, i, j;

        for (i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            reverse(arr, 0, arr.length - 1);
            return;
        }

        for (j = arr.length - 1; j > idx; j--) {
            if (arr[j] > arr[idx]) {
                break;
            }
        }

        swap(arr, idx, j);

        reverse(arr, idx + 1, arr.length - 1);
    }

    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
