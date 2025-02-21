package SingleLinkedList;
import java.util.*;
public class Sort0s1s2s {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node head;
    public static Node sort(Node head){
        Node zeroHead=new Node(-1);
        Node oneHead=new Node(-1);
        Node twoHead=new Node(-1);
        Node one=oneHead;
        Node zero=zeroHead;
        Node two=twoHead;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=zero.next;
            }
            else if(temp.data==1){
                one.next=temp;
                one=one.next;
            }
            else{
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
        }
        zero.next=(oneHead.next!=null)?oneHead.next : two.next;
        one.next=twoHead.next;
        two.next=null;
        return zeroHead.next;
    }
    public static void printLL(Node head){
        Node temp2=head;
        while(temp2!=null){
            System.out.print(temp2.data+ " ");
            temp2=temp2.next;
        }
    }
    public static void main(String args[]){
        Sort0s1s2s ll=new Sort0s1s2s();
        ll.head=new Node(1);
        ll.head.next=new Node(0);
        ll.head.next.next=new Node(1);
        ll.head.next.next.next=new Node(2);
        ll.head.next.next.next.next=new Node(0);
        ll.head.next.next.next.next.next=new Node(2);
        ll.head.next.next.next.next.next.next=new Node(1);
        ll.head=ll.sort(ll.head);
        ll.printLL(ll.head);

    }
    
}
