package dsaSheet_StacksAndQueues;

import java.util.*;

public class SortStackByRecursion {
    static void sortedStack(Stack<Integer> s) {
        // BAse condition
        if (s.isEmpty()) {
            return;
        }
        int x = s.peek();
        s.pop();
        sortedStack(s);
        Stack<Integer> tmpStack = new Stack<>();
        while (!s.isEmpty() && x   <s.peek() ){ 
            tmpStack.push(s.pop());
        }
        s.push(x);
        while (!tmpStack.isEmpty()) {
            s.push(tmpStack.pop());
        }

    }

    public static void main(String args[]) {

        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);
        sortedStack(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }

}
