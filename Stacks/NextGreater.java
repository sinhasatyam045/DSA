package Stacks;

import java.util.*;

public class NextGreater { // Time Complexity is O(n)
    public static void main(String args[]) {
        int arr[] = { 1, 23, 12, 9, 30, 2, 50 };
        Stack<Integer> st = new Stack<>();
        int nG[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop(); /*
                           * 4possible modification question can be made:-
                           * 1)Next greater left-> Just reverse the for loop condition for left to right
                           * 2)Next Smaller Right->just reverse the while loop condition
                           * 
                           * 3)Next Smaller Left->Just reverse both for loop and while loop condition
                           */
            }
            if (st.isEmpty())
                nG[i] = -1;
            else {
                nG[i] = arr[st.peek()];
            }
            st.push(i);
        }
        for (int i = 0; i < nG.length; i++) {
            System.out.print(nG[i] + " ");
        }

    }

}
// * */