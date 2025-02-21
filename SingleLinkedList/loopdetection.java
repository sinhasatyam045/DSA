package SingleLinkedList;
public class loopdetection {
    static class Node{
        int data;
        Node next;
        public Node(int data){
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

    public void detect(){
        Node slow=head;
        Node fast=head;
        
        while(slow!=null&& fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                System.out.println("Loop Detected");
                return;
            }
        }
        System.out.println("Loop not detected");

    }

    public static void main(String args[]){
        loopdetection ll=new loopdetection();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.head.next.next.next.next=head;
        ll.detect();
    }
    
}
