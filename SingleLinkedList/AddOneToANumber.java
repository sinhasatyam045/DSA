package SingleLinkedList;
import java.util.*;
public class AddOneToANumber {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node head;
    public static void print(Node head){
        Node head1=reverse(head);
        Node temp=head1;
        int carry=1;
        int sum=0;
        while(temp!=null){
            sum=temp.data+carry;
            temp.data=sum%10;
            carry=sum/10;
            temp=temp.next;
        }
        temp=(carry==0)?null:new Node(carry);
        Node head2=reverse(head1);
        Node temp2=head2;
        while(temp2!=null){
            System.out.print(temp2.data+" ");
            temp2=temp2.next;
        }
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
    
    

    public static void main(String args[]){
        AddOneToANumber ll=new AddOneToANumber();
        ll.head=new Node(1);
        ll.head.next=new Node(5);
        ll.head.next.next=new Node(9);
        ll.print(ll.head);

    }
    
}
