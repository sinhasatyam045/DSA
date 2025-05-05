package SingleLinkedList;

public class AddTwoNumbers {

    // Definition for singly-linked list
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to add two numbers represented by linked lists
    public static Node addTwoNumbers(Node head1, Node head2) {
        Node head3=reverse(head1);
        Node head4=reverse(head2);
        int carry=0;
        Node dummy=new Node(0);
        Node start=dummy;

        while(head3!=null || head4!=null || carry!=0){
            int sum=0;
            if(head3!=null){
                sum+=head3.data;
                head3=head3.next;
            }
            if(head4!=null){
                sum+=head4.data;
                head4=head4.next;
            }
            if(carry!=0){
                sum+=carry;
            }
            start.next=new Node(sum%10);
            start=start.next;
            carry=sum/10;
        }

        Node res=reverse(dummy.next);
        return res;

    }

    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    // Utility function to print the linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // First number: 342 (stored as 2 -> 4 -> 3)
        Node head1 = new Node(4);
        head1.next = new Node(5);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(9);

        // Second number: 465 (stored as 5 -> 6 -> 4)
        Node head2 = new Node(3);
        head2.next = new Node(5);
         

        System.out.println("First Number: ");
        printList(head1);

        System.out.println("Second Number: ");
        printList(head2);

        // Add two numbers
        Node result = addTwoNumbers(head1,head2);

        System.out.println("Sum: ");
        printList(result);
    }
}
