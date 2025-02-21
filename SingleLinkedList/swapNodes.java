package SingleLinkedList;

public class swapNodes {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node head;
    Node tail;

    public void push(int data) {

        // step 1:
        Node lastNode = new Node(data);

        // BaseCase:
        if (head == null) {
            head = tail = lastNode;
            return;
        }

        // step 2:
        tail.next = lastNode;

        // step 3:
        tail = lastNode;
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

    public void swap(Node head, int x, int y) {
        Node temp = head;
        while (temp != null) {
            int i = 1;
            for ( i = 1; i < x && temp != null; i++) {
                temp = temp.next;
                

            }
            if (temp == null)
                return;
            Node t = temp.next;
            for (i = x; i <= y && t != null; i++) 
                return reverse();
            
            
    
    }

    public static void main(String[] args) {
        swapNodes ll = new swapNodes();
        int x = 2, y = 4;
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);
        ll.print();
        ll.swap(head, 2, 4);
        ll.print();

    }

}
