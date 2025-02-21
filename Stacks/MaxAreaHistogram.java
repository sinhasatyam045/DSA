package Stacks;

import java.util.*;

public class MaxAreaHistogram {
    public static void maximumArea(int heights[]) {
        int maxArea = 0;
        // nsr
        Stack<Integer> st = new Stack<>();
        int nsr[] = new int[heights.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty())
                nsr[i] = heights.length;
            else {
                nsr[i] = st.peek();
            }
            st.push(i);
        }
        // nsl
        st = new Stack<>();
        int nsl[] = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty())
                nsl[i] = -1;
            else {
                nsl[i] = st.peek();
            }
            st.push(i);
        }
        // maxareacompute
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int area = height * width;
            maxArea = Math.max(area, maxArea);
        }
        System.out.println("Maximum Area: " + maxArea);
    }

    public static void main(String args[]) {
        int heights[] = { 2, 1, 5, 6, 2, 3 };
        maximumArea(heights);
    }
}
