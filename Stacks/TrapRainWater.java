package Stacks;

import java.util.*;

public class TrapRainWater {
    public static void compute(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int ngr[] = new int[arr.length];
        int ngl[] = new int[arr.length];
        // ngr
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ngr[i] = -1;
            } else {
                ngr[i] = arr[i];
            }
            st.push(i);
        }

        // ngl
        st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ngr[i] = -1;
            } else {
                ngr[i] = arr[i];
            }
            st.push(i);
        }

        // compute
        int maxwater = 0;
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = ngr[i] - ngl[i] - 1;
            int ans = height * width;
            maxwater = Math.max(ans, maxwater);
        }
        System.out.print(maxwater);
    }

    public static void main(String args[]) {
        int arr[] = { 7, 0, 4, 2, 5, 0, 6, 4, 0, 6 };
        compute(arr);
    }

}
