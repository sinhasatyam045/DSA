package Stacks;

import java.util.*;

public class ValidParenthesis {
    public static boolean checkvalid(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr == '[' || curr == '(' || curr == '{') {
                st.push(curr);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                if ((st.peek() == '[' && curr == ']') ||
                        (st.peek() == '{' && curr == '}') ||
                        (st.peek() == '(' && curr == ')')) {
                    st.pop();
                } else {
                    return false;
                }

            }
        }
        if (st.isEmpty()) {
            return true;
        }
        return false;

    }

    public static void main(String args[]) {
        String str = "(({[]})";
        System.out.print(checkvalid(str));

    }

}
