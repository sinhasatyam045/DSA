package Queues;

import java.util.*;

public class InterleaveOfQueue {
    static void interLeave(Queue<Integer> q) {
        Queue<Integer> Q = new LinkedList<>();
        int size = q.size();
        for (int i = 0; i < size / 2; i++) {
            Q.add(q.remove());
        }
        while (!Q.isEmpty()) {
            q.add(Q.remove());
            q.add(q.remove());
        }

    }

    public static void main (String args[]){
        Queue<Integer> q=new LinkedList<>();
        q.addq.add(2);q.add(3);q.add(4);q.add(5);q.add(6);q.add(7);q.add(8);q.add(9);

    
        interLeave(q);
        System.out.println("The interleaved queue is: ");
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
