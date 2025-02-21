package dsaSheet_StacksAndQueues;

import java.util.*;

public class ReverseStackByRecursion {
    static void reverseStack(Stack<Integer> s) {
        // Base condition
        if (s.isEmpty()) {
            return;
        }
        int x = s.peek();
        s.pop();
        reverseStack(s);
        insertBottom(s, x);
    }

    static void insertBottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
        } else {
            int tmp = s.peek();
            s.pop();

            insertBottom(s, x);
            s.push(tmp);
        }

    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s);
        reverseStack(s);

        System.out.println(s);

    }

}
