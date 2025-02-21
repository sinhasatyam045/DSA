package Queues;

import java.util.*;

public class ReverseFirstkElements {
    static void printkReversal(Deque<Integer> dq, int k) {
        if (k <= 0 || k > dq.size()) {

            System.out.println("Invalid 'k' value");
            return;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            q.add(dq.removeFirst());
        }
        while (!q.isEmpty()) {
            dq.addFirst(q.remove());
        }
    }

    public static void main(String args[]) {
        Deque<Integer> dq = new LinkedList<>();
        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(4);
        dq.add(5);
        dq.add(6);
        dq.add(7);
        dq.add(8);
        dq.add(9);
        dq.add(10);
        int k = 5;

        printkReversal(dq, k);

        while (!dq.isEmpty()) {
            System.out.print(dq.removeFirst() + " ");
        }
        System.out.println();
    }
}
