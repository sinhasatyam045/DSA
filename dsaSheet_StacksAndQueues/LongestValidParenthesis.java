package dsaSheet_StacksAndQueues;

import java.util.*;

public class LongestValidParenthesis {
    static int validParenthesis(String str) {
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr == '(') {
                s.push(i);

            } else {
                if (!s.isEmpty()) {
                    s.pop();
                }
                if (!s.isEmpty()) {
                    res = Math.max(res, (i - s.peek()));
                } else {
                    s.push(i);
                }

            }
        }
        return res;
    }

    public static void main(String args[]) {
        String str = "(()())";
        System.out.print(validParenthesis(str));

    }

}
