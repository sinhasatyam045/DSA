package dsaSheet_Arrays;

public class MaximumProductSubArray {
    static int maxProduct(int arr[], int n) {
        int maxEndingHere = 1;
        int minEndingHere = 1;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                maxEndingHere = maxEndingHere * arr[i];
                minEndingHere = Math.min(minEndingHere * arr[i], 1);
            } else if (arr[i] == 0) {
                maxEndingHere = 1;
                minEndingHere = 1;
            } else {
                int temp = maxEndingHere;
                maxEndingHere = Math.max(minEndingHere * arr[i], 1);
                minEndingHere = temp * arr[i];
            }

            maxProduct = Math.max(maxProduct, maxEndingHere);
        }

        return maxProduct;
    }

    public static void main(String args[])  {
        int arr[] = { 1, 2, -3, 4, 5, 6 };
        int n = arr.length;
        int maxProduct = maxProduct(arr, n);
        
        System.out.print(maxProduct);
    }
}
