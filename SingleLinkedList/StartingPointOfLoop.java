package SingleLinkedList;

public class StartingPointOfLoop {

    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
        }
    }
    public static Node head;

    public static Node findStart(Node head){
        Node slow=head;
        Node fast=head;
        Node temp=head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {   
                slow = head;

                 
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;   
            }
        }
        return null;
    }

    public static void main(String args[]){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(15);
        head.next.next.next.next=new Node(4);
        head.next.next.next.next.next=new Node(13);
        head.next.next.next.next.next.next=new Node(6);
        head.next.next.next.next.next.next.next=new Node(7);
        head.next.next.next.next.next.next.next.next=new Node(8);
        head.next.next.next.next.next.next.next.next.next=new Node(9);
        head.next.next.next.next.next.next.next.next.next.next=head.next.next.next;

        Node res=findStart(head);
        System.out.print(res.data);

    }
    
}
