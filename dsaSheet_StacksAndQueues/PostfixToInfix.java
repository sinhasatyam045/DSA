package dsaSheet_StacksAndQueues;

import java.util.*;

public class PostfixToInfix {
    static int convertToInfix(String str) {
        Stack<Integer> s = new Stack<>();
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr == '+' || curr == '-' || curr == '*' || curr == '/') {
                int value1 = s.pop();
                int value2 = s.pop();
                if (curr == '+') {
                    s.push(value2 + value1);
                } else if (curr == '-') {
                    s.push(value2 - value1);

                } else if (curr == '*') {
                    s.push(value2 * value1);
                } else if (curr == '/') {
                    s.push(value2 / value1);
                }

            } else {
                s.push(curr - '0');
            }

        }
        return s.pop();

    }

    public static void main(String args[]) {
        String str = "231*+9-";
        System.out.println(convertToInfix(str));
    }

}
