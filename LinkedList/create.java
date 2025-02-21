package LinkedList;

public class create {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;

    public static void addLast(int data) {
        Node lastnode = new Node(data);
        if (head == null) {
            head = tail = lastnode;
        } else {
            tail.next = lastnode;
            tail = lastnode;
        }
    }

    public static void addFirst(int data) {
        Node firstnode = new Node(data);
        if (head == null) {
            head = tail = firstnode;
        } else {
            firstnode.next = head;
            head = firstnode;
        }
    }

    public static void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public static void removeLast() {
        if (head == null || head.next == null) {
            head = tail = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    public static void printLL() {
        Node temp = head;
        while (temp != null) {
            System.err.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String args[]) {
        create ll = new create();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(3);
        ll.addFirst(4);
        // ll.removeFirst();
        // ll.removeLast();
        ll.reverse();
        ll.removeLast();
        ll.printLL();
    }
}
