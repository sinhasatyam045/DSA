package Stacks;

import java.util.*;

public class DuplicateParenthesis {
    public static boolean isDuplicate(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr == ')') {
                int count = 0;
                while (!st.isEmpty() && st.peek() != '(') {
                    st.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    st.pop();
                }
            } else {
                st.push(curr);
            }
        }
        return false;

    }

    public static void main(String args[]) {
        String str = "((a+b))";
        System.out.println(isDuplicate(str));

    }

}
