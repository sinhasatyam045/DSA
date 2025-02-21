package Practice;
import java.util.*;
public class practiceLCA {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node findLCA(Node root,int n1,int n2){

        if(root==null){
            return null;
        }
        if(root.data==n1 || root.data==n2){
            return root;
        }

        Node leftLCA=findLCA(root.left,n1,n2);
        Node rightLCA=findLCA(root.right,n1,n2);
        if(leftLCA!=null && rightLCA!=null){
            return root;
        }
        return leftLCA==null? rightLCA:leftLCA;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().trim();
        String input[]=str.split(" ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(input[i]);
        }
        Queue<Node>q=new LinkedList<>();
        Node root=new Node(arr[0]);
        q.add(root);
        for(int i=1;i<n;i+=2){
            Node front=q.remove();
            if(arr[i]!=-1){
                front.left=new Node(arr[i]);
                q.add(front.left);
            }
            if(arr[i+1]!=-1){
                front.right=new Node(arr[i+1]);
                q.add(front.right);
            }
        }
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.print(findLCA(root,n1,n2));
    }
    
}
