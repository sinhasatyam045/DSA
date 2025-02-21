package SingleLinkedList;
import java.util.*;
public class LengthOfLoop {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    public static int countLength(Node head){
        
        Node slow=head;
        Node fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return count(slow);
            }
        }
        return -1;
    }

    public static int count(Node slow){
        int c=1;
        Node temp=slow.next;
        while(temp!=slow){
            c++;
            temp=temp.next;;
        }
        return c;
    }

    public static void main(String args[]){
        LengthOfLoop ll=new LengthOfLoop();
        ll.head=new Node(1);
        ll.head.next=new Node(2);
        ll.head.next.next=new Node(15);
        ll.head.next.next.next=new Node(4);
        ll.head.next.next.next.next=new Node(13);
        ll.head.next.next.next.next.next=new Node(6);
        ll.head.next.next.next.next.next.next=new Node(7);
        ll.head.next.next.next.next.next.next.next=new Node(8);
        ll.head.next.next.next.next.next.next.next.next=new Node(9);
        ll.head.next.next.next.next.next.next.next.next.next=ll.head.next.next;

        System.out.print(ll.countLength(ll.head));

    }
    
}
