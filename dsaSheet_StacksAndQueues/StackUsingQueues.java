package dsaSheet_StacksAndQueues;

import java.util.*;

public class StackUsingQueues {
    static class Stack {
        static Queue<Character> q1 = new LinkedList<>();
        static Queue<Character> q2 = new LinkedList<>();

        static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        static void push(char ch) {
            if (!q1.isEmpty()) {
                q1.add(ch);
            } else {
                q2.add(ch);
            }

        }

         static int pop() {
            if (isEmpty()) {
                System.out.println("EmptyStack");
                return '-';
            }
            char top = ' ';
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(q1.remove());

                }

            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(q2.remove());

                }

            }
            return top;
        }

        static int peek() {
            if (isEmpty()) {
                System.out.println("EmptyStack");
                return -1;
            }
            char top = ' ';
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();

                    q2.add(q1.remove());

                }

            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();

                    q1.add(q2.remove());

                }

            }
            return top;

        }
    }

    public static void main(String args[]) {

        Stack st = new Stack();

        st.push('D');
        st.push('O');
        st.push('G');
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }

    }

}
