package SingleLinkedList;
import java.util.*;
public class AddTwoNumbers {

    public static Node head1;
    public static Node head2;

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node getSum(Node head1,Node head2){
        reverse(head1);
        reverse(head2);
        int num1=getSum(head1);
        int num2=getSum(head2);
        int sum=num1+num2;
        
        Node resHead=new Node(sum%10);
        sum=sum/10;
        int dig=0;
        while(sum>0){
            dig=sum%10;
            resHead.next=new Node(dig);
            sum/=10;

        }
        return resHead;

    }
    public static void reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static int getSum(Node head1){
        Node temp=head1;
        int s=0;
        while(temp!=null){
            s=(s*10)+temp.data;
            temp=temp.next;
        }
        return s;
    }


    public static void main(String args[]){
        AddTwoNumbers ll=new AddTwoNumbers();
        ll.head1=new Node(3);
        ll.head1.next=new Node(5);
        

        ll.head2=new Node(4);
        ll.head2.next=new Node(5);
        ll.head2.next.next=new Node(9);
        ll.head2.next.next.next=new Node(9);

        Node res=ll.getSum(head1,head2);
        System.out.print(res.data);
    }
    
}
