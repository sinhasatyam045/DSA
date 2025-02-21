package SingleLinkedList;

public class palindromeCheck {

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

        // step 1:
        Node firstNode = new Node(data);

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

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is my mid node
    }

    public boolean checkPalindrome() {
        // Base case
        if (head == null || head.next == null) {
            return true;
        }
        // Step 1:find mid
        Node midNode = findMid(head);

        // Step 2: reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // Step 3->Check left half and right half nodes
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static void main(String[] args) {
        palindromeCheck pp = new palindromeCheck();
        pp.insert(1);
        pp.insert(2);
        pp.insert(3);
        pp.insert(2);
        pp.insert(1);
        pp.print();
        System.out.println(pp.checkPalindrome());

    }

}
