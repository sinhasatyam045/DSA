package Queues;

import java.util.*;

public class BinaryQueue {
    public static void printBinary(int N) {
        Queue<String> Q = new LinkedList<>();
        String s1 = "";
        String s2 = "";
        Q.add("1");
        while (N-- > 0) {
            s1 = Q.peek();
            Q.remove();
            System.out.print(s1+" ");
            s2 = s1;
            Q.add(s1 + "0");
            Q.add(s1 + "1");

        }

    }

    public static void main(String[] args) {
        int N = 5;
        printBinary(N);
    }
}
