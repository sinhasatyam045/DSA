package dsaSheet_StacksAndQueues;

import java.util.*;

public class StackPermutations {
    static void checkStackPermutations(int ip[], int op[], int n) {
        Stack<Integer> s = new Stack<>();
        int j = 0;
        for (int i = 0; i < n; i++) {
            s.push(ip[i]);
            while (!s.isEmpty() && s.peek() == op[j]) {
                s.pop();
                j++;
            }

        }
        if (s.isEmpty()) {
            System.out.println("Possible");
        } else {
            System.out.println("Not Possible");
        }
    }

    public static void main(String args[]) {
        int ip[] = { 1, 2, 3 };
        int op[] = { 2, 1, 3 };
        int n = 3;
        checkStackPermutations(ip, op, n);

    }

}
