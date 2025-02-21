package dsaSheet_StacksAndQueues;

import java.util.*;

public class InfixToPostfix {
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;

    }

    static String convertToPostfix(String str) {
        Stack<Character> s = new Stack<>();
        String res = " ";
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (Character.isLetterOrDigit(curr)) {
                res = res + curr;

            } else if (curr == '(') {
                s.push(curr);

            } else if (curr == ')') {
                while (!s.isEmpty() && s.peek() != '(') {
                    res += s.peek();
                    s.pop();
                }
                s.pop();

            } else {
                while (!s.isEmpty() && precedence(curr) <= precedence(s.peek())) {
                    res += s.peek();
                    s.pop();

                }
                s.push(curr);

            }
        }
        while (!s.isEmpty()) {
            res += s.peek();
            s.pop();
        }

        return res;
    }

    public static void main(String args[]) {
        String str = "((A+2)-C*(D/E))+F";
        System.out.print(convertToPostfix(str));
    }

}
