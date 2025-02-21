package Stacks;
import java.util.*;

public class MinimumStack {
    static class MinStack {
        Stack<Integer> stack;
        Stack<Integer> minstack;

        public MinStack() {
            stack = new Stack<>();
            minstack = new Stack<>();
        }
        
        public void push(int val) {
            stack.push(val);
            if (minstack.isEmpty() || val <= minstack.peek()) {
                minstack.push(val);
            }
        }

        public void pop() {
            if (!stack.isEmpty()) {
                if (stack.peek().equals(minstack.peek())) {
                    minstack.pop();
                }
                stack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minstack.peek();
        }
    }

    public static void main(String args[]) {
        MinStack mm = new MinStack();
        mm.push(2);
        mm.push(3);
        mm.pop();
        mm.push(4);
        mm.push(-1);
        mm.top();
        mm.push(6);
        mm.getMin();
        mm.pop();
        System.out.println("Current minimum: " + mm.getMin());
    }
}
