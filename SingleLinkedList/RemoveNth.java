package SingleLinkedList;

public class RemoveNth {

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

        while (temp != null) {

            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");

    }

    public void removeFromEnd(int n) {
        // for calculating the size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;

            if (n == size) {
                head = head.next;
                return;
            }
            Node prev = head;
            int i = 1;
            int iToFind = size - n + 1;
            while (i < iToFind) {
                prev = prev.next;
                i++;

            }
            prev.next = prev.next.next;
            return;
        }

    }

    public static void main(String[] args) {
        RemoveNth rr = new RemoveNth();
        rr.insert(5);
        rr.insert(4);
        rr.insert(3);
        rr.insert(2);
        rr.insert(1);
        rr.print();
        rr.removeFromEnd(3);
        rr.print();

    }
}
