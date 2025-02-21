package Stacks;

import java.util.*;

public class ReverseString {

    public static String revCall(String str) {
        Stack<Character> s = new Stack<>();
        int i = 0;
        for (i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        StringBuilder rev = new StringBuilder("");
        while (!s.isEmpty()) {
            char ch = s.pop();
            rev.append(ch);
        }
        return rev.toString();

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = revCall(str);
        System.out.println(res);

    }

}
