package SingleLinkedList;

public class reverse {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void insert(int data) {
        Node firstNode = new Node(data);

        if (head == null) {
            head = tail = firstNode;
            return;
        }

        // step 2:
        firstNode.next = head;

        // step 3:
        head = firstNode;
    }

    public void print() {

        // BaseCase:
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        int c = 0;
        while (temp != null) {

            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");

    }

    public void reverse() {
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

    public static void main(String[] args) {
        reverse rr = new reverse();
        rr.insert(4);
        rr.insert(3);
        rr.insert(2);
        rr.insert(1);
        rr.print();
        rr.reverse();
        rr.print();
    }
}
