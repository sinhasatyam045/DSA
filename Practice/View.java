package Practice;
import java.util.*;
public class View{
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void rightView(Node root, ArrayList<Integer> res, int level) {
        if (root == null) {
            return;
        }
        if (level == res.size()) {
            res.add(root.data);  
        }
        rightView(root.right, res, level + 1);  
        rightView(root.left, res, level + 1);  
    }
    public static void leftView(Node root,ArrayList<Integer>res,int level){
        if(root==null){
            return;
        }
        if(level==res.size()){
            res.add(root.data);
        }
        leftView(root.left,res,level+1);
        leftView(root.right,res,level+1);
    } 
    
    public static void printInOrder(Node root) {
        if (root == null) {
            return;
        }
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

    public static void main(String args[]) {
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(4);
        root.right.left = new Node(2);
    
        printInOrder(root);
        System.out.println();
    
        ArrayList<Integer> res = new ArrayList<>();
        rightView(root, res, 0);
        for (int i : res) {
            System.out.print(i + " ");
        }

        System.out.println();
        
        res.clear();
        leftView(root,res,0);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
    
}