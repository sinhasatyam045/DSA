package SingleLinkedList;

public class intersection {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node head1, head2;

    // For finding the intersection node
    public Node getNode() {
        int c1 = getCount(head1);
        int c2 = getCount(head2);
        int d = 0;
        if (c1 > c2) {
            d = c1 - c2;
            return getIntersection(d, head1, head2);
        }
        d = c2 - c1;
        return getIntersection(d, head1, head2);
    }

    // For getting the intersection node
    public Node getIntersection(int d, Node h1, Node h2) {
        Node temp1 = h1;
        Node temp2 = h2;
        while (d != 0) {
            if (temp1 == null) {
                return null;
            }
            temp1 = temp1.next;
            d--;
        }
        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2) {
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }

    // For finding the count of the linked list
    public int getCount(Node n) {
        Node tmp = n;
        int c = 0;
        while (tmp != null) {
            c++;
            tmp = tmp.next;
        }
        return c;
    }

    public static void main(String[] args) {
        intersection ss = new intersection();

        // Create first linked list
        ss.head1 = new Node(10);
        ss.head1.next = new Node(2);
        ss.head1.next.next = new Node(4);
        ss.head1.next.next.next = new Node(7);
        ss.head1.next.next.next.next = new Node(5);

        // Create second linked list
        ss.head2 = new Node(1);
        ss.head2.next = new Node(7);
        ss.head2.next.next = new Node(5);

        Node intersectionNode = ss.getNode();
        if (intersectionNode == null) {
            System.out.println("No intersection found");
        } else {
            System.out.println("Intersection node: " + intersectionNode.data);
        }
    }
}
