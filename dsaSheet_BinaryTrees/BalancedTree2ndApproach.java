package dsaSheet_BinaryTrees;

public class BalancedTree2ndApproach {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    public static void checkBalanced(Node root){
        
    }

    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(4);
        root.left.left=new Node(3);
        root.right.left=new Node(5);
        root.right.right=new Node(6);
        root.left.left.left=new Node(9);
        root.right.right.right=new Node(7);
        root.right.right.right.right=new Node(8);
        checkBalanced(root);
    }
    
}
