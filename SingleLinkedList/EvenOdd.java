package SingleLinkedList;

public class EvenOdd {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void push(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void segEvenOdd(){
        if(head==null){
            System.out.print("LL is empty");
            return;
        }
        Node evenhead=null;
        Node eventail=null;
        Node oddhead=null; // corrected variable name
        Node oddtail=null; // corrected variable name
        Node temp=head;
        while(temp!=null){
            if(temp.data%2==0){
                if(evenhead==null){
                    evenhead=eventail=temp;
                }
                else{
                    eventail.next=temp;
                    eventail=temp;
                }
            }
            else{
                if(oddhead==null){
                    oddhead=oddtail=temp;
                }
                else{
                    oddtail.next=temp;
                    oddtail=temp;
                }
            }
            temp=temp.next;
        }
        if(evenhead!=null){
            eventail.next=oddhead;
        }
        if(oddhead!=null){
            oddtail.next=null;
        }
        head=evenhead!=null? evenhead:oddhead;

    }
    public void printLL(){
        if(head==null){
            System.out.print("LL empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        EvenOdd ll=new EvenOdd();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);
        ll.segEvenOdd();
        ll.printLL();
    }
}
