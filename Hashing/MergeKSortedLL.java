package Hashing;

import java.util.PriorityQueue;

public class MergeKSortedLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Declare head nodes for each linked list
    static Node head1, head2, head3;

    public static void printKSorted() {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);

        // Add all elements from linked lists to the priority queue
        addElementsToQueue(head1, pq);
        addElementsToQueue(head2, pq);
        addElementsToQueue(head3, pq);

        // Now printing it in the form of linked list
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + "->");
        }
        System.out.print("null");
    }

    // Helper method to add elements of a linked list to the priority queue
    private static void addElementsToQueue(Node head, PriorityQueue<Integer> pq) {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            pq.offer(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        MergeKSortedLL ll = new MergeKSortedLL();
        ll.head1 = new Node(1);
        ll.head1.next = new Node(3);
        ll.head1.next.next = new Node(5);
        ll.head1.next.next.next = new Node(7);
        ll.head1.next.next.next.next = new Node(9);

        ll.head2 = new Node(2);
        ll.head2.next = new Node(4);
        ll.head2.next.next = new Node(6);
        ll.head2.next.next.next = new Node(8);

        ll.head3 = new Node(2);
        ll.head3.next = new Node(4);
        ll.head3.next.next = new Node(6);
        ll.head3.next.next.next = new Node(8);

        printKSorted();
    }
}
