package SingleLinkedList;

public class RetainDelete {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node head;

    public void print() {

        // BaseCase:
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");

    }

    public void retain(Node head, int M, int N) {
        Node curr = head;
        Node t;
        int i = 1;
        while (curr != null) {
            // for retaining M nodes
            for (i = 1; i < M && curr != null; i++) {
                curr = curr.next;
            }
            if (curr == null)
                return;
            t = curr.next;
            // for deleting N nodes
            for (i = 1; i <= N && t != null; i++) {
                Node temp = t;
                t = t.next;

            }
            curr.next = t;
            curr = t;

        }
    }

    public static void main(String[] args) {
        RetainDelete ll = new RetainDelete();
        int M = 2, N = 2;
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(4);
        ll.head.next.next.next.next = new Node(5);
        ll.head.next.next.next.next.next = new Node(6);
        ll.print();
        ll.retain(head, 2, 2);
        ll.print();

    }

}
