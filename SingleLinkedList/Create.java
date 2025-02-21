package SingleLinkedList;

public class Create {

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

    public static int size; // creating a static variable for calculating size so that complexity doesnt
                            // increase.

    // Method 1
    public void addFirst(int data) {

        // step 1:
        Node firstNode = new Node(data);
        size++;

        // Base Case:
        if (head == null) {
            head = tail = firstNode;
            return;
        }

        // step 2:
        firstNode.next = head;

        // step 3:
        head = firstNode;
    }

    // Method 2
    public void addLast(int data) {

        // step 1:
        Node lastNode = new Node(data);
        size++;

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

    // Method 3
    public void removeFirst() {

        // Base Case 1:
        if (size == 0) { // We can also use if(head==null)
            System.out.println("Sorry,its empty");
            return;
        }
        size--;
        // Base Case 2:
        if (size == 1) {
            head = tail = null;
            return;
        }

        head = head.next;
    }

    // Method 4
    public void removeLast() {
        // Base Case 1:
        if (size == 0) { // We can also use if(head==null)
            System.out.println("Sorry,its empty");
            return;
        }
        size--;
        // Base Case 2:
        if (size == 1) {
            head = tail = null;
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < size - 1) {
            temp = temp.next;
            i++;
        }
        temp.next = null;
        tail = temp;

    }

    // Print the Linked List
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

    // Recursive Search
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // Adding in the middle
    public void add(int idx, int data) {
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // when i=idx-1,temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Reversing a Linked List
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
        Create cc = new Create();

        cc.addFirst(2);

        cc.addFirst(1);

        cc.addLast(3);

        cc.addLast(4);
        // cc.add(2, 9);
        // cc.removeFirst();
        // cc.removeLast();

        cc.print();
        // cc.reverse();
        // cc.print();

        // System.out.println(cc.size);
        System.out.println(cc.recSearch(9));
    }

}

// For calculating the size of Linked List,brute force-> simply traverse the
// linked list and count but that
// increases the time complexity.
// Rather ,we can initialise a public static variable size and if ADD property
// is used,we write size++ and
// if REMOVE property is used we use size--
